<%--
  Created by IntelliJ IDEA.
  User: lyrics
  Date: 2017/2/27
  Time: 下午12:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学员基础信息 - 管理</title>
    <link type="text/css" rel="stylesheet"
          href="${pageContext.request.contextPath}/static/extjs/resources/css/ext-all-neptune-debug.css">
    <script src="${pageContext.request.contextPath}/static/extjs/bootstrap.js"></script>
</head>
<body>
<script type="text/javascript">
    Ext.require([
        'Ext.form.*',
        'Ext.tip.QuickTipManager'
    ]);
    Ext.onReady(function () {
        var required = '<span style="color:red;font-weight:bold" data-qtip="Required">*</span>', addWindow, form;

        Ext.tip.QuickTipManager.init();

        function showContactForm() {
            Ext.Ajax.request({
                url: "/uuid.do",
                method: "GET",
                success: function (response, options) {
                    var json = Ext.JSON.decode(response.responseText);
                    if (!addWindow) {
                        form = Ext.widget('form', {
                            layout: {
                                type: 'vbox',
                                align: 'stretch'
                            },
                            border: false,
                            bodyPadding: 10,

                            fieldDefaults: {
                                labelAlign: 'top',
                                labelWidth: 100,
                                labelStyle: 'font-weight:bold'
                            },
                            items: [{
                                xtype: 'fieldcontainer',
                                layout: 'hbox',
                                defaultType: 'textfield',

                                fieldDefaults: {
                                    labelAlign: 'top'
                                },

                                items: [{
                                    flex: 3,
                                    name: 'sId',
                                    itemId: "sId",
                                    afterLabelTextTpl: required,
                                    fieldLabel: 'ID',
                                    allowBlank: false,
                                    readOnly: true
                                },
                                    {
                                        flex: 2,
                                        name: 'sName',
                                        afterLabelTextTpl: required,
                                        fieldLabel: '姓名',
                                        allowBlank: false,
                                        margins: '0 0 0 5'
                                    }
                                ]
                            },
                                {
                                    xtype: "fieldcontainer",
                                    layout: 'hbox',

                                    fieldDefaults: {
                                        labelAlign: 'top'
                                    }
                                    ,
                                    items: [{
                                        flex: 1,
                                        xtype: 'combobox',
                                        fieldLabel: '性别',
                                        queryMode: 'local',
                                        displayField: 'nSex',
                                        allowBlank: false
                                    }, {
                                        flex: 2,
                                        xtype: 'combobox',
                                        fieldLabel: '学校',
                                        queryMode: 'local',
                                        displayField: 'nSchoolNo',
                                        margins: '0 0 0 5',
                                        allowBlank: false
                                    }]
                                }
                                ,
                                {
                                    xtype: "fieldcontainer",
                                    layout: 'hbox',

                                    fieldDefaults: {
                                        labelAlign: 'top'
                                    }
                                    ,
                                    items: [{
                                        flex: 1,
                                        xtype: 'textfield',
                                        fieldLabel: '邮箱',
                                        afterLabelTextTpl: required,
                                        vtype: 'email',
                                        allowBlank: false
                                    }, {
                                        flex: 1,
                                        xtype: 'textfield',
                                        fieldLabel: '微信',
                                        afterLabelTextTpl: required,
                                        allowBlank: false,
                                        margins: '0 0 0 5'
                                    }, {
                                        flex: 1,
                                        xtype: 'textfield',
                                        fieldLabel: 'QQ',
                                        afterLabelTextTpl: required,
                                        allowBlank: false,
                                        margins: '0 0 0 5'
                                    }]
                                }
                                ,
                                {
                                    xtype: 'combobox',
                                    fieldLabel: '班级',
                                    queryMode: 'local',
                                    displayField: 'nSchoolNo',
                                    allowBlank: false
                                }
                                ,
                                {
                                    xtype: 'textfield',
                                    fieldLabel: '电话',
                                    afterLabelTextTpl: required,
                                    allowBlank: false,
                                }
                                ,
                                {
                                    xtype: 'textareafield',
                                    fieldLabel: '备注',
                                    labelAlign: 'top',
                                    flex: 1,
                                    margins: '0',
                                    afterLabelTextTpl: required,
                                    allowBlank: true
                                }
                            ],
                            buttons: [{
                                text: '取消',
                                handler: function () {
                                    this.up('form').getForm().reset();
                                    this.up('window').hide();
                                }
                            }, {
                                text: '提交',
                                handler: function () {
                                    if (this.up('form').getForm().isValid()) {
                                        // In a real application, this would submit the form to the configured url
                                        // this.up('form').getForm().submit();
                                        this.up('form').getForm().reset();
                                        this.up('window').hide();
                                        Ext.MessageBox.alert('Thank you!', 'Your inquiry has been sent. We will respond as soon as possible.');
                                    }
                                }
                            }]
                        })
                        ;

                        addWindow = Ext.widget('window', {
                            title: '编辑',
                            closeAction: 'hide',
                            width: 400,
                            height: 450,
                            minWidth: 300,
                            minHeight: 300,
                            layout: 'fit',
                            resizable: true,
                            modal: true,
                            items: form,
                            defaultFocus: 'sId'
                        });
                    }
                    form.getForm().findField("sId").setValue(json.uuid);
                    addWindow.show();
                },
                failure: function (response, options) {

                }
            });
        }

        Ext.define("manager.model.Student", {
            extend: "Ext.data.Model",
            fields: [
                {name: "sId", type: "string"},
                {name: "sName", type: "string"},
                {name: "nSex", type: "string"},
                {name: "sIdCard", type: "string"},
                {name: "nSchoolNo", type: "string"},
                {name: "sStudentNo", type: "string"},
                {name: "sClass", type: "string"},
                {name: "sPhone", type: "string"},
                {name: "sEmail", type: "string"},
                {name: "sWeiXin", type: "string"},
                {name: "sQQ", type: "string"},
                {name: "sMark", type: "string"},
                {name: "dCreate", type: "string"}
            ]
        });
        var store = Ext.create("Ext.data.Store", {
            model: "manager.model.Student",
            autoLoad: true,
            pageSize: 15,
            proxy: {
                type: "ajax",
                url: "${pageContext.request.contextPath}/static/json/student_base.json",
                reader: {
                    root: "rows"
                }
            }
        });

        var grid;
        grid = Ext.create("Ext.grid.Panel", {
            xtype: "grid",
            title: "学员基础信息 - 管理",
            store: store,
            columnLines: true,
            renderTo: Ext.getBody(),
            selModel: {
                injectCheckbox: 0,
                mode: "SIMPLE",     //"SINGLE"/"SIMPLE"/"MULTI"
                checkOnly: true     //只能通过checkbox选择
            },
            selType: "checkboxmodel",
            columns: [
                {text: "ID", dataIndex: "sId"},
                {text: "姓名", dataIndex: "sName"},
                {text: "性别", dataIndex: "nSex", width: 50},
                {text: "身份证", dataIndex: "sIdCard", width: 160},
                {text: "所属学校", dataIndex: "nSchoolNo", width: 120},
                {text: "学生证", dataIndex: "sStudentNo", width: 120},
                {text: "分配-班级", dataIndex: "sClass", width: 160},
                {text: "联系方式", dataIndex: "sPhone", width: 110},
                {text: "邮箱", dataIndex: "sEmail", width: 160},
                {text: "微信", dataIndex: "sWeiXin"},
                {text: "QQ", dataIndex: "sQQ"},
                {text: "备注", dataIndex: "sMark"},
                {text: "创建时间", dataIndex: "dCreate"},
            ],
            tbar: [{
                xtype: "button",
                text: "新增学员",
                handler: function () {
                    showContactForm();
                }
            }, "-", {
                xtype: "button",
                text: "删除选中项"
            }, "->", {
                xtype: "label",
                text: '* 双击选中，进行编辑',
                style: {
                    color: "red", font: "normal 10px courier !important"
                }
            }],
            bbar: {
                xtype: "pagingtoolbar", store: store, displayInfo: true
            }
        })
        ;
    });
</script>
</body>
</html>

