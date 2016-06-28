/**
 * Created by jpp on 21/06/16.
 */
    $('#formulario').bootstrapValidator({
        fields:{
            nome:{
                message: 'Nome Inválido',
                validators:{
                    notEmpty:{
                        message: 'O nome é um campo obrigatório'
                    },
                    stringLength:{
                        min: 2,
                        max: 60,
                        message: 'O nome deverá ter entre 2 e 60 caracteres'
                    }
                }
            },
            descricao:{
                message: 'Descrição é inválida',
                validators: {
                    notEmpty:{
                        message:'A bebida deve ter uma descrição'
                    },
                    stringLength:{
                        min: 15,
                        max: 250,
                        message: 'A bebida deve ter uma descrição entre 15 e 250 caracteres'
                    }
                }
            }
        }
    });

    $('#formUser').bootstrapValidator({
        fields: {
            confirmPassword: {
                validators: {
                    identical: {
                        field: 'password',
                        message: 'A password e a sua confirmação são diferentes'
                    }
                }
            },
            email: {
                validators: {
                    emailAddress: {
                        message: 'O email não é válido'
                    }
                }
            },
            confirmEmail: {
                validators: {
                    identical: {
                        field: 'email',
                        message: 'O email e a sua confirmação são diferentes'
                    }
                }
            }
        }
    });

    $('#formBar').bootstrapValidator({
        fields: {
            confirmPassword: {
                validators: {
                    identical: {
                        field: 'password',
                        message: 'A password e a sua confirmação são diferentes'
                    }
                }
            },
            email: {
                validators: {
                    emailAddress: {
                        message: 'O email não é válido'
                    }
                }
            },
            confirmEmail: {
                validators: {
                    identical: {
                        field: 'email',
                        message: 'O email e a sua confirmação são diferentes'
                    }
                }
            }
        }
    });

