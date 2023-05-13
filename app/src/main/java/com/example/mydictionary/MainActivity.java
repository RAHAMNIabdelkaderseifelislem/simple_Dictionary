package com.example.mydictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private HashMap <String,String> words;
    private EditText searchText;
    private Button searchButton;
    private TextView wordTitle;
    private TextView definitionText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initDictionary();
        searchText = findViewById(R.id.searchEditText);
        searchButton = findViewById(R.id.searchButton);
        wordTitle = findViewById(R.id.wordTitle);
        definitionText = findViewById(R.id.definitionText);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String word = searchText.getText().toString().toLowerCase();
                String definition = searchWord(word);

                wordTitle.setText(word);
                definitionText.setText(definition);
            }
        });
    }

    private void initDictionary(){
        words = new HashMap<>();
        // adding words
        words.put("mot","Succession de sons dans les langues parlées, ou de signes dans les langues des signes ou écrites, qui a un sens propre, et qui est isolée soit par deux blancs à l’écrit, soit par une pause à l’oral.");
        words.put("parole","Faculté naturelle de parler. Ton de la voix, selon qu’elle est forte ou faible, douce ou rude, la qualité du débit, selon qu’il est précis ou confus.");
        words.put("voix","Ensemble de sons produits par les cordes vocales.");
        words.put("ensemble","L’un avec l’autre, les uns avec les autres, conjointement.\n" +
                "En même temps, concomitamment, simultanément.");
        words.put("temps","Durée des choses, marquée par certaines périodes, et principalement par la révolution apparente du soleil ; écart entre le déroulement de deux événements.");
        words.put("abhorrer", "Avoir en horreur");
        words.put("acception ", "Sens");
        words.put("admonester", "Réprimander");
        words.put("affectation", "Manque de naturel");
        words.put("agapes ", "Festin");
        words.put("alleguer ", "Prétexter");
        words.put("amphigouri", "Langage embrouillé");
        words.put("annihiler", "Réduire à néant");
        words.put("arroger", "Attribuer par décision personnelle");
        words.put("ascete", "Qui mène une vie austère");
        words.put("astreindre", "Assujettir, contraindre");
        words.put("atermoiements", "Tergiversations");
        words.put("attiedir", "Rendre moins vif");
        words.put("aureoler", "Donner de l’éclat, du prestige");
        words.put("collusion", "Accord secret");
        words.put("conciliabule", "Conversation où l’on chuchote");
        words.put("congenere", "Individu du même genre");
        words.put("connivence", "Complicité");
        words.put("contempteur", "Personne qui dénigre");
        words.put("corroborer", "Appuyer une idée");
        words.put("deference", "Soumission");
        words.put("deliquescence", "Corruption, décomposition");
        words.put("desavouer", "Nier, désapprouver");
        words.put("devoyer", "Détourner du droit chemin");
        words.put("dispendieux", "Cher, coûteux");
        words.put("dissension", "Discorde");
        words.put("dissentiment", "Désaccord, opposition");
        words.put("dissolu", "Débauché");
        words.put("dithyrambique", "Très élogieux");
        words.put("draconien", "D’une excessive sévérité");
        words.put("drastique", "Qui exerce une action très énergique");
        words.put("econduire", "Congédier");
        words.put("edulcore", "Adouci, affadi");
        words.put("entremeler", "Mélanger, associer");
        words.put("exacerber", "Exaspérer, irriter, aggraver");
        words.put("expectative ", "Attente, espérance");
        words.put("factice", "Faux, imité, pas naturel");
        words.put("fantasque", "Imprévisible, original");
        words.put("florilege", "Recueil d’œuvres");
        words.put("frenesie", "État d’exaltation violente ");
        words.put("fustiger", "Blâmer, critiquer violemment");
        words.put("gager", "Parier, être sûr");
        words.put("gregaire", "Qui a l’instinct de groupe");
        words.put("griefs ", "Charges, reproches");
        words.put("haranguer", "Exhorter, encourager");
        words.put("harassant", "Extrêmement fatigant, éreintant ");
        words.put("hantise", "Obsession, peur maladive");
        words.put("histrion", "Personne bouffonne");
        words.put("imperitie", "Manque d’aptitude, d’habileté");
        words.put("inanite", "Caractère de ce qui est vain");
        words.put("incivilite", "Ne respecte pas les règles de vie");
        words.put("incurie", "Manque d’organisation, laisser aller");
        words.put("instigation", "Sollicitation, suggestion");
        words.put("interlope", "Illégal, douteux, suspect");
        words.put("inextinguible ", "Qui ne peut s’éteindre");
        words.put("labyrinthique", "Qui est d’une complexité inextricable");
        words.put("lapidaire", "Concis, succinct");
        words.put("laudatif ", "Élogieux");
        words.put("limpide", "Parfaitement clair, intelligible, transparent");
        words.put("luciferien", "Diabolique");
        words.put("malingre", "Rachitique, chétif, maladif");
        words.put("meandre", "Labyrinthe");
        words.put("mesalliance ", "Union de personnes différentes ");
        words.put("nebuleux", "Qui manque de clarté, imprécis");
        words.put("objurgations", "Mises en garde");
        words.put("obligeant ", "Serviable");
        words.put("obnubile ", "Entêté, obsédé");
        words.put("obscurantisme ", "Ignorance, préjugés");
        words.put("occurrences ", "Apparitions");
        words.put("olympien", "Noble, majestueux");
        words.put("ondoyer", "Bouger en s’élevant et s’abaissant");
        words.put("opacite", "Caractère de ce qui est obscur");
        words.put("palabrer", "Discuter longuement  ");
        words.put("pallier", "Éviter");
        words.put("parer e", "Faire face à, affronter");
        words.put("plethore", "Abondance, excès");
        words.put("perorer ", "Parler avec emphase");
        words.put("petulant ", "Vif, brusque, fougueux");
        words.put("pecule", "Économies");
        words.put("panegyrique", "Éloge");
        words.put("prodigalite ", "Dépense");
        words.put("plethorique ", "Surabondant");
        words.put("paganisme ", "Qui relève du monde païen");
        words.put("privautes ", "Familiarités");
        words.put("s’ebaudir", "S’étonner grandement ");
        words.put("s’enferrer", "Se prendre à ses propres mensonges");
        words.put("se dedire", "Se rétracter, ne pas tenir sa parole");
        words.put("sophisme", "Raisonnement qui s’avère faux");
        words.put("sourcilleux", "Exigeant, pointilleux, sévère");
        words.put("stipendier", "Acheter sa complicité");
        words.put("stupre", "Luxure");
        words.put("sublimer", "Transcender, rendre meilleur");
        words.put("suborner ", "Séduire et corrompre");
        words.put("subside", "Aide financière");
        words.put("traverses ", "Épreuves");
        words.put("transports", "Élans");
        words.put("veloce", "Qui se déplace à grande vitesse");
        words.put("venal ", "Qui cherche l’intérêt matériel");
        words.put("vicier", "Polluer, corrompre, rendre nul");
        words.put("vituperer", "Blâmer, protester");

    }

    private String searchWord(String word){
        if (words.get(word)!=null)
            return words.get(word);
        return "le mot "+word+" est introuvable";
    }
}