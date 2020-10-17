package com.example.myappgsifinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collections;

import myclasses.Question;
import myclasses.Message;

public class QuizQuestionsActivity extends AppCompatActivity {

    TextView questionView, ctQuestionView;
    RadioGroup radioQuestions;
    RadioButton ans1, ans2, ans3;
    Button startOverBt, nextQuestionBt;

    ArrayList<Question> questionList = new ArrayList();
    public static ArrayList<Question> finalQuestionList = new ArrayList();
    int ctQuestion = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_questions);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        questionView = (TextView) findViewById(R.id.question);
        radioQuestions = (RadioGroup) findViewById(R.id.rgGroup);
        ans1 = (RadioButton) findViewById(R.id.ans1);
        ans2 = (RadioButton) findViewById(R.id.ans2);
        ans3 = (RadioButton) findViewById(R.id.ans3);
        startOverBt = (Button) findViewById(R.id.startOverBt);
        nextQuestionBt = (Button) findViewById(R.id.nextQuestionBt);
        ctQuestionView = findViewById(R.id.ctQuestionView);



        Question question1 = new Question("Quais os requisitos mínimos para uma senha segura?",
                "Conter letras, números e no mínimo 8 carácteres.",
                "Conter carácteres especiais, números, letras maiúsculas e minúsculas e no mínimo 8 carácteres.",
                "Conter carácteres especiais, números, apenas letras maiúsculas e no mínimo 8 carácteres especiais.",
                2);

        Question question2 = new Question("Qual o mais seguro padrão de criptografia para WI-FI atualmente?",
                "TKIP",
                "WEP",
                "WPA3",
                3);

        Question question3 = new Question("Devo me conectar a WI-FI público...:",
                "...sempre quiser acessar dados bancários pela internet.",
                "...sempre que quiser acessar redes sociais e sites de entretenimento mesmo que o wifi seja aberto a todos.",
                "...evitar utilizar wifi público e se precisar utilizar VPN.",
                3);

        Question question4 = new Question("Qual a forma de autenticação mais segura das três listadas a baixo?",
                "Biometria Digital.",
                "PIN de 4 dígitos",
                "Reconhecimento facial",
                1);

        Question question5 = new Question("Sobre salvar minhas informações de pagamento em sites de compra, é CORRETO afirmar...:",
                "...que sempre que puder, devo salvar as informações, pois isso auxilia a não ter que digitar nas próximas compras.",
                "...não devo salvar as informações, pois os sites sempre estão suscetíveis a invasões e meus dados podem ser roubados.",
                "...salvar apenas quando for compras pequenas, pois o risco de roubo não é tão grande.",
                2);

        Question question6 = new Question("Sobre a criação de senhas, é CORRETO afirmar que...:",
                "...devo evitar utilizar senhas iguais em mais de uma conta, e se necessário utilizar gerenciadores de senhas confiáveis para guardá-las.",
                "...devo utilizar senhas diferentes para cada conta e optar por senhas pequenas e apenas numéricas para facilitar lembrar elas.",
                "...devo utilizar senhas iguais para todas as contas pois assim preciso lembrar de apenas uma.",
                1);

        Question question7 = new Question("O que fazer quando precisar utilizar um software pago?",
                "Instalar um cracker para poder utilizar o software sem pagar.",
                "Comprar o software sempre em sites ou revendedores oficiais e seguir as instruções de instalação.",
                "Pedir para que um profissional da área de TI instale o software com um cracker para não ter que pagar.",
                2);

        Question question8 = new Question("O que fazer quando tiver seus dados roubados por um cybercriminoso que está pedindo recompensa por eles?",
                "Procurar um profissional da área de TI para recuperar o backup dos seus dados se possível e acionar as autoridades.",
                "Pagar a recompensa para o cybercriminoso.",
                "Enviar seu equipamento ao cibercrminoso para que ele recupere os dados para você.",
                1);

        Question question9 = new Question("O que fazer se seu equipamento começar a ter comportamentos estranhos como desligar, abrir telas sozinho ou apresentar lentidão?",
                "Trocar o monitor",
                "Deixar fora da tomada por 1 dia inteiro.",
                "Escanear com um anti-virus e se não resolver procurar auxílio de um profissional de TI.",
                3);

        Question question10 = new Question("Sobre e-mails, é CORRETO afirmar...:",
                "...que devo evitar abrir anexos com extensões desconhecidas e principalmente de pessoas ou assuntos que desconheço.",
                "...que sempre devo abrir todos os e-mail ou anexos, pois podem ser prêmios ou oportunidades de mudar de vida.",
                "...que não devo abrir nenhum e-mail e solicitar arquivos apenas via WhatsApp.",
                1);

        questionList.add(question1);
        questionList.add(question2);
        questionList.add(question3);
        questionList.add(question4);
        questionList.add(question5);
        questionList.add(question6);
        questionList.add(question7);
        questionList.add(question8);
        questionList.add(question9);
        questionList.add(question10);

        Collections.shuffle(questionList);

        nextQuestionView(questionList, ctQuestion);
    }

    public void nextQuestionView(ArrayList<Question> questionList, int ctQuestion) {
        int ctQuestionPlus1 = ctQuestion + 1;

        questionView.setText(questionList.get(ctQuestion).getQuestion());
        ctQuestionView.setText(ctQuestionPlus1 + " / 10");
        ans1.setText(questionList.get(ctQuestion).getAnswer1());
        ans2.setText(questionList.get(ctQuestion).getAnswer2());
        ans3.setText(questionList.get(ctQuestion).getAnswer3());
    }

    public void NextQuestionBtClicked(View view) {
        int choice = findRadioQuestionSelected();

        if (choice == -1) {
            //Nenhuma opção selecionada, pede para selecionar uma opção
            Message.message(getApplicationContext(), R.string.noCheckedRadioBtMessage);
        }
        else {
            questionList.get(ctQuestion).setChoice(choice);
            radioQuestions.clearCheck();
            if (ctQuestion < 9) {
                ctQuestion ++;
                nextQuestionView(questionList, ctQuestion);
            }
            else {
                //Finaliza o quiz
                finalQuestionList = questionList;
                endQuiz();
            }
        }
    }

    private int findRadioQuestionSelected() {
        if (ans1.isChecked()) {
            return 1;
        }
        else if (ans2.isChecked()) {
            return 2;
        }
        else if (ans3.isChecked()) {
            return 3;
        }
        else {
            return -1;
        }
    }

    public void endQuiz() {
        Intent screen = new Intent(this, FinalQuizActivity.class);
        startActivity(screen);
    }

    public void startOver (View view) {
        Intent screen = new Intent(this, Quiz.class);
        startActivity(screen);
    }
}