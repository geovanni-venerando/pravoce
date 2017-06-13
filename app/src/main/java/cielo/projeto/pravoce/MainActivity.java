package cielo.projeto.pravoce;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botaoum;
    private Button botaodois;
    private Button botaotres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoum = (Button) findViewById(R.id.idBotaoUm);
        botaodois = (Button) findViewById(R.id.idBotaoDois);
        botaotres = (Button) findViewById(R.id.idBotaoTres);

        botaoum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Pagamento.class));
            }
        });

        botaodois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Pagamento.class));
            }
        });

        botaotres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Pagamento.class));
            }
        });
    }
}
