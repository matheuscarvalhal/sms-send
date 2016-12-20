function mascara(o, f) {
    v_obj = o;
    v_fun = f;
    setTimeout("execmascara()", 1);
}

function execmascara() {
    v_obj.value = v_fun(v_obj.value);
}

function cpf_mask(v) {
    v = v.replace(/\D/g, "");            //Remove tudo o que não é dígito
    v = v.replace(/(\d{3})(\d)/, "$1.$2");    //Coloca ponto entre o terceiro e o quarto dígitos
    v = v.replace(/(\d{3})(\d)/, "$1.$2");    //Coloca ponto entre o setimo e o oitava dígitos
    v = v.replace(/(\d{3})(\d)/, "$1-$2");   //Coloca ponto entre o decimoprimeiro e o decimosegundo dígitos
    return v;
}


function mascaraData(o, f) {
    v_obj = o;
    v_fun = f;
    setTimeout("execmascaradata()", 1);
}

function execmascaradata() {
    v_obj.value = v_fun(v_obj.value);
}

function data_mask(v) {
    v = v.replace(/\D/g, "");            //Remove tudo o que não é dígito
    v = v.replace(/(\d{2})(\d)/, "$1/$2");    //Coloca ponto entre o terceiro e o quarto dígitos
    v = v.replace(/(\d{2})(\d)/, "$1/$2");    //Coloca ponto entre o setimo e o oitava dígitos
    return v;
}