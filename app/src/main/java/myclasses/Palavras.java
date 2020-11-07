package myclasses;

import java.util.Random;

public class Palavras {

    private String[] palavras = new String[] {"SEGURANÇA", "DISPONIBILIDADE", "INTEGRIDADE",
            "CONFIDENCIALIDADE", "LGPD", "MALWARE", "VÍRUS", "ANTIVÍRUS", "PENDRIVE",
            "MARCO CIVIL", "RISCOS", "VULNERABILIDADE", "DANOS", "LEGISLAÇÃO", "COMPUTADOR",
            "REDE SOCIAL", "DINHEIRO", "SENHA", "PIN", "BRASIL",
            "TELEVISOR", "POLTRONA", "SECADORA", "ESCORREDOR", "LIQUIDIFICADOR",
            "SMARTPHONE", "INTERNET", "GESTÃO DE RISCO", "USB", "FALHAS",
            "GESTÃO DE SEGURANÇA", "INFORMAÇÃO", "SÃO PAULO", "DESASTRE NATURAL", "ENERGIA",
            "COLABORADORES", "AMOR", "INTELECTUAL", "TABLET", "CULTURA", "SABEDORIA",
            "VAZAMENTO", "GOVERNO BRASILEIRO", "PENALIDADES", "CRIMES CIBERNÉTICOS", "CAPACITAÇÃO", "ATENÇÃO",
            "POLÍTICA DE SEGURANÇA", "NÍVEL DE RISCO", "INVESTIMENTO", "PROTEÇÃO", "NOTEBOOK",
            "SIGILO", "LEI", "CAUTELA", "EDUCAÇÃO", "CRIANÇAS", "GANHOS",
            "EXECUTIVOS", "DIA A DIA", "BRASILEIRO", "SERVIDORES", "NORMAS",
            "ADMINISTRAÇÃO", "PROGRAMADOR", "EMPRESA", "CASA", "PÚBLICO",
            "PRIVADO", "INCLUSÃO DIGITAL", "NEUTRALIDADE", "CYBER CRIME", "WEBCAM",
            "CAMERA", "PRIVACIDADE", "AUTORIZAÇÃO", "PROFESSOR", "SENHA MULTIFATOR", "FAMÍLIA",
            "DOCUMENTÁRIO", "DOCUMENTOS", "FAMILIARES", "ARQUIVOS"};

    public Palavras() {
    }

    public String sorteio() {
        String palavraSorteada = palavras[(int)(random()*palavras.length)];

        return palavraSorteada;
    }

    public static double random() {
        Random r = new Random();

        return r.nextDouble();
    }
}

