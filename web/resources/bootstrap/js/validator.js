/**
 * Created by jpp on 21/06/16.
 */
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