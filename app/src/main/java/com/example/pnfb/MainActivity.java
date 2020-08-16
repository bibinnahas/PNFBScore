package com.example.pnfb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText wc;
    private EditText tg;
    private EditText ast;
    private EditText alb;
    private Button pnfbScore;
    private TextView result;
    private TextView senResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wc = (EditText) findViewById(R.id.wc);
        tg = (EditText) findViewById(R.id.tg);
        ast = (EditText) findViewById(R.id.ast);
        alb = (EditText) findViewById(R.id.alb);
        pnfbScore = (Button) findViewById(R.id.score);
        result = (TextView) findViewById(R.id.result);
        senResult = (TextView) findViewById(R.id.sensitivityResult);

        pnfbScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int wC = Integer.parseInt(wc.getText().toString());
                int tG = Integer.parseInt(tg.getText().toString());
                int aST = Integer.parseInt(ast.getText().toString());
                double aLB = Double.parseDouble(alb.getText().toString());
                double pNFB = 2.564 + (0.049 * wC) + (0.005 * tG) + (0.016 * aST) - (0.578 * aLB);
                double sensitivity = 0;
                double specificity = 0;

                DecimalFormat df = new DecimalFormat("###.###");

                if (pNFB >= 2.193 && pNFB < 3.287801) {
                    sensitivity = (1 * 100);
                    specificity = (0 * 100);
                } else if (pNFB >= 3.2878 && pNFB < 3.586801) {
                    sensitivity = (1 * 100);
                    specificity = (0.014 * 100);
                } else if (pNFB >= 3.5868 && pNFB < 3.916601) {
                    sensitivity = (1 * 100);
                    specificity = (0.027 * 100);
                } else if (pNFB >= 3.9166 && pNFB < 4.042901) {
                    sensitivity = (1 * 100);
                    specificity = (0.0409999999999999 * 100);
                } else if (pNFB >= 4.0429 && pNFB < 4.050201) {
                    sensitivity = (1 * 100);
                    specificity = (0.0549999999999999 * 100);
                } else if (pNFB >= 4.0502 && pNFB < 4.114601) {
                    sensitivity = (1 * 100);
                    specificity = (0.0679999999999999 * 100);
                } else if (pNFB >= 4.1146 && pNFB < 4.215301) {
                    sensitivity = (1 * 100);
                    specificity = (0.082 * 100);
                } else if (pNFB >= 4.2153 && pNFB < 4.259801) {
                    sensitivity = (1 * 100);
                    specificity = (0.096 * 100);
                } else if (pNFB >= 4.2598 && pNFB < 4.273401) {
                    sensitivity = (1 * 100);
                    specificity = (0.11 * 100);
                } else if (pNFB >= 4.2734 && pNFB < 4.315801) {
                    sensitivity = (1 * 100);
                    specificity = (0.123 * 100);
                } else if (pNFB >= 4.3158 && pNFB < 4.351801) {
                    sensitivity = (1 * 100);
                    specificity = (0.137 * 100);
                } else if (pNFB >= 4.3518 && pNFB < 4.448001) {
                    sensitivity = (1 * 100);
                    specificity = (0.151 * 100);
                } else if (pNFB >= 4.448 && pNFB < 4.549101) {
                    sensitivity = (1 * 100);
                    specificity = (0.164 * 100);
                } else if (pNFB >= 4.5491 && pNFB < 4.559801) {
                    sensitivity = (1 * 100);
                    specificity = (0.178 * 100);
                } else if (pNFB >= 4.5598 && pNFB < 4.567501) {
                    sensitivity = (1 * 100);
                    specificity = (0.192 * 100);
                } else if (pNFB >= 4.5675 && pNFB < 4.587501) {
                    sensitivity = (1 * 100);
                    specificity = (0.205 * 100);
                } else if (pNFB >= 4.5875 && pNFB < 4.611101) {
                    sensitivity = (1 * 100);
                    specificity = (0.219 * 100);
                } else if (pNFB >= 4.6111 && pNFB < 4.642101) {
                    sensitivity = (1 * 100);
                    specificity = (0.233 * 100);
                } else if (pNFB >= 4.6421 && pNFB < 4.679901) {
                    sensitivity = (1 * 100);
                    specificity = (0.247 * 100);
                } else if (pNFB >= 4.6799 && pNFB < 4.721401) {
                    sensitivity = (1 * 100);
                    specificity = (0.26 * 100);
                } else if (pNFB >= 4.7214 && pNFB < 4.754501) {
                    sensitivity = (1 * 100);
                    specificity = (0.274 * 100);
                } else if (pNFB >= 4.7545 && pNFB < 4.793201) {
                    sensitivity = (1 * 100);
                    specificity = (0.288 * 100);
                } else if (pNFB >= 4.7932 && pNFB < 4.847201) {
                    sensitivity = (1 * 100);
                    specificity = (0.301 * 100);
                } else if (pNFB >= 4.8472 && pNFB < 4.877901) {
                    sensitivity = (1 * 100);
                    specificity = (0.315 * 100);
                } else if (pNFB >= 4.8779 && pNFB < 4.902401) {
                    sensitivity = (1 * 100);
                    specificity = (0.329 * 100);
                } else if (pNFB >= 4.9024 && pNFB < 4.927101) {
                    sensitivity = (1 * 100);
                    specificity = (0.342 * 100);
                } else if (pNFB >= 4.9271 && pNFB < 4.935901) {
                    sensitivity = (1 * 100);
                    specificity = (0.356 * 100);
                } else if (pNFB >= 4.9359 && pNFB < 4.949501) {
                    sensitivity = (1 * 100);
                    specificity = (0.37 * 100);
                } else if (pNFB >= 4.9495 && pNFB < 4.988901) {
                    sensitivity = (1 * 100);
                    specificity = (0.384 * 100);
                } else if (pNFB >= 4.9889 && pNFB < 5.024901) {
                    sensitivity = (0.9 * 100);
                    specificity = (0.384 * 100);
                } else if (pNFB >= 5.0249 && pNFB < 5.036901) {
                    sensitivity = (0.9 * 100);
                    specificity = (0.397 * 100);
                } else if (pNFB >= 5.0369 && pNFB < 5.044001) {
                    sensitivity = (0.9 * 100);
                    specificity = (0.411 * 100);
                } else if (pNFB >= 5.044 && pNFB < 5.052801) {
                    sensitivity = (0.9 * 100);
                    specificity = (0.425 * 100);
                } else if (pNFB >= 5.0528 && pNFB < 5.065101) {
                    sensitivity = (0.9 * 100);
                    specificity = (0.438 * 100);
                } else if (pNFB >= 5.0651 && pNFB < 5.081301) {
                    sensitivity = (0.9 * 100);
                    specificity = (0.452 * 100);
                } else if (pNFB >= 5.0813 && pNFB < 5.109001) {
                    sensitivity = (0.9 * 100);
                    specificity = (0.466 * 100);
                } else if (pNFB >= 5.109 && pNFB < 5.126601) {
                    sensitivity = (0.9 * 100);
                    specificity = (0.479 * 100);
                } else if (pNFB >= 5.1266 && pNFB < 5.129501) {
                    sensitivity = (0.9 * 100);
                    specificity = (0.479 * 100);
                } else if (pNFB >= 5.1295 && pNFB < 5.136401) {
                    sensitivity = (0.9 * 100);
                    specificity = (0.507 * 100);
                } else if (pNFB >= 5.1364 && pNFB < 5.147901) {
                    sensitivity = (0.9 * 100);
                    specificity = (0.521 * 100);
                } else if (pNFB >= 5.1479 && pNFB < 5.167001) {
                    sensitivity = (0.9 * 100);
                    specificity = (0.534 * 100);
                } else if (pNFB >= 5.167 && pNFB < 5.204001) {
                    sensitivity = (0.9 * 100);
                    specificity = (0.548 * 100);
                } else if (pNFB >= 5.204 && pNFB < 5.238201) {
                    sensitivity = (0.9 * 100);
                    specificity = (0.562 * 100);
                } else if (pNFB >= 5.2382 && pNFB < 5.260401) {
                    sensitivity = (0.9 * 100);
                    specificity = (0.575 * 100);
                } else if (pNFB >= 5.2604 && pNFB < 5.288801) {
                    sensitivity = (0.9 * 100);
                    specificity = (0.589 * 100);
                } else if (pNFB >= 5.2888 && pNFB < 5.313101) {
                    sensitivity = (0.9 * 100);
                    specificity = (0.603 * 100);
                } else if (pNFB >= 5.3131 && pNFB < 5.336901) {
                    sensitivity = (0.9 * 100);
                    specificity = (0.616 * 100);
                } else if (pNFB >= 5.3369 && pNFB < 5.367301) {
                    sensitivity = (0.9 * 100);
                    specificity = (0.63 * 100);
                } else if (pNFB >= 5.3673 && pNFB < 5.416301) {
                    sensitivity = (0.9 * 100);
                    specificity = (0.644 * 100);
                } else if (pNFB >= 5.4163 && pNFB < 5.454001) {
                    sensitivity = (0.9 * 100);
                    specificity = (0.658 * 100);
                } else if (pNFB >= 5.454 && pNFB < 5.468701) {
                    sensitivity = (0.9 * 100);
                    specificity = (0.671 * 100);
                } else if (pNFB >= 5.4687 && pNFB < 5.479001) {
                    sensitivity = (0.9 * 100);
                    specificity = (0.685 * 100);
                } else if (pNFB >= 5.479 && pNFB < 5.515601) {
                    sensitivity = (0.9 * 100);
                    specificity = (0.699 * 100);
                } else if (pNFB >= 5.5156 && pNFB < 5.565301) {
                    sensitivity = (0.9 * 100);
                    specificity = (0.712 * 100);
                } else if (pNFB >= 5.5653 && pNFB < 5.578701) {
                    sensitivity = (0.9 * 100);
                    specificity = (0.726 * 100);
                } else if (pNFB >= 5.5787 && pNFB < 5.612301) {
                    sensitivity = (0.9 * 100);
                    specificity = (0.74 * 100);
                } else if (pNFB >= 5.6123 && pNFB < 5.676401) {
                    sensitivity = (0.9 * 100);
                    specificity = (0.753 * 100);
                } else if (pNFB >= 5.6764 && pNFB < 5.722501) {
                    sensitivity = (0.8 * 100);
                    specificity = (0.753 * 100);
                } else if (pNFB >= 5.7225 && pNFB < 5.748601) {
                    sensitivity = (0.8 * 100);
                    specificity = (0.767 * 100);
                } else if (pNFB >= 5.7486 && pNFB < 5.764601) {
                    sensitivity = (0.8 * 100);
                    specificity = (0.781 * 100);
                } else if (pNFB >= 5.7646 && pNFB < 5.772701) {
                    sensitivity = (0.8 * 100);
                    specificity = (0.795 * 100);
                } else if (pNFB >= 5.7727 && pNFB < 5.794001) {
                    sensitivity = (0.8 * 100);
                    specificity = (0.808 * 100);
                } else if (pNFB >= 5.794 && pNFB < 5.831801) {
                    sensitivity = (0.8 * 100);
                    specificity = (0.822 * 100);
                } else if (pNFB >= 5.8318 && pNFB < 5.894301) {
                    sensitivity = (0.8 * 100);
                    specificity = (0.836 * 100);
                } else if (pNFB >= 5.8943 && pNFB < 5.948201) {
                    sensitivity = (0.8 * 100);
                    specificity = (0.849 * 100);
                } else if (pNFB >= 5.9482 && pNFB < 6.004701) {
                    sensitivity = (0.8 * 100);
                    specificity = (0.863 * 100);
                } else if (pNFB >= 6.0047 && pNFB < 6.050801) {
                    sensitivity = (0.7 * 100);
                    specificity = (0.863 * 100);
                } else if (pNFB >= 6.0508 && pNFB < 6.066101) {
                    sensitivity = (0.7 * 100);
                    specificity = (0.877 * 100);
                } else if (pNFB >= 6.0661 && pNFB < 6.136801) {
                    sensitivity = (0.7 * 100);
                    specificity = (0.89 * 100);
                } else if (pNFB >= 6.1368 && pNFB < 6.201401) {
                    sensitivity = (0.6 * 100);
                    specificity = (0.89 * 100);
                } else if (pNFB >= 6.2014 && pNFB < 6.237001) {
                    sensitivity = (0.6 * 100);
                    specificity = (0.904 * 100);
                } else if (pNFB >= 6.237 && pNFB < 6.305701) {
                    sensitivity = (0.5 * 100);
                    specificity = (0.904 * 100);
                } else if (pNFB >= 6.3057 && pNFB < 6.369501) {
                    sensitivity = (0.4 * 100);
                    specificity = (0.904 * 100);
                } else if (pNFB >= 6.3695 && pNFB < 6.433201) {
                    sensitivity = (0.4 * 100);
                    specificity = (0.918 * 100);
                } else if (pNFB >= 6.4332 && pNFB < 6.475801) {
                    sensitivity = (0.4 * 100);
                    specificity = (0.932 * 100);
                } else if (pNFB >= 6.4758 && pNFB < 6.486601) {
                    sensitivity = (0.4 * 100);
                    specificity = (0.945 * 100);
                } else if (pNFB >= 6.4866 && pNFB < 6.509301) {
                    sensitivity = (0.3 * 100);
                    specificity = (0.945 * 100);
                } else if (pNFB >= 6.5093 && pNFB < 6.575101) {
                    sensitivity = (0.3 * 100);
                    specificity = (0.959 * 100);
                } else if (pNFB >= 6.5751 && pNFB < 6.695501) {
                    sensitivity = (0.3 * 100);
                    specificity = (0.973 * 100);
                } else if (pNFB >= 6.6955 && pNFB < 7.076901) {
                    sensitivity = (0.3 * 100);
                    specificity = (0.986 * 100);
                } else if (pNFB >= 7.0769 && pNFB < 7.562101) {
                    sensitivity = (0.3 * 100);
                    specificity = (1 * 100);
                } else if (pNFB >= 7.5621 && pNFB < 8.028501) {
                    sensitivity = (0.2 * 100);
                    specificity = (1 * 100);
                } else if (pNFB >= 8.0285 && pNFB < 9.324001) {
                    sensitivity = (0.1 * 100);
                    specificity = (1 * 100);
                } else if (pNFB >= 9.324 && pNFB < 1.000001) {
                    sensitivity = (0 * 100);
                    specificity = (1 * 100);
                } else {
                    sensitivity = 999;
                    specificity = 999;
                }

                result.setText(String.valueOf("PNFB Score: " + df.format(pNFB)));
                senResult.setText(String.valueOf("Sensitivity: " + sensitivity + "\nSpecificity: " + specificity));
            }
        });

    }
}