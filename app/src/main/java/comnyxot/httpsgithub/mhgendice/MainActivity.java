package comnyxot.httpsgithub.mhgendice;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView img_weapon, img_monster;
    private TextView name_weapon, name_style, name_monster;
    private int[] imgArray_weapon;
    private String[] nameArray_weapon;
    private String[] nameArray_style;
    private int[] imgArray_monster;
    private String[] nameArray_monster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgArray_weapon = new int[15];
        imgArray_weapon[0] = R.drawable.greatsword;
        imgArray_weapon[1] = R.drawable.longsword;
        imgArray_weapon[2] = R.drawable.swordandshield;
        imgArray_weapon[3] = R.drawable.dualblades;
        imgArray_weapon[4] = R.drawable.hammer;
        imgArray_weapon[5] = R.drawable.huntinghorn;
        imgArray_weapon[6] = R.drawable.lance;
        imgArray_weapon[7] = R.drawable.gunlance;
        imgArray_weapon[8] = R.drawable.switchaxe;
        imgArray_weapon[9] = R.drawable.chargeblade;
        imgArray_weapon[10] = R.drawable.lightbowgun;
        imgArray_weapon[11] = R.drawable.heavybowgun;
        imgArray_weapon[12] = R.drawable.insectglaive;
        imgArray_weapon[13] = R.drawable.bow;
        imgArray_weapon[14] = R.drawable.prowler;

        nameArray_weapon = new String[15];
        nameArray_weapon[0] = "GreatSword";
        nameArray_weapon[1] = "Longsword";
        nameArray_weapon[2] = "Sword and Shield";
        nameArray_weapon[3] = "Dual Blades";
        nameArray_weapon[4] = "Hammer";
        nameArray_weapon[5] = "Hunting Horn";
        nameArray_weapon[6] = "Lance";
        nameArray_weapon[7] = "Gunlance";
        nameArray_weapon[8] = "Switch Axe";
        nameArray_weapon[9] = "Charge Blade";
        nameArray_weapon[10] = "Light Bowgun";
        nameArray_weapon[11] = "Heavy Bowgun";
        nameArray_weapon[12] = "Insect Glaive";
        nameArray_weapon[13] = "Bow";
        nameArray_weapon[14] = "Prowler";

        nameArray_style = new String[4];
        nameArray_style[0] = "Guild Style";
        nameArray_style[1] = "Stiker Style";
        nameArray_style[2] = "Aerial Style";
        nameArray_style[3] = "Adept Style";

        imgArray_monster = new int[70];
        nameArray_monster = new String[70];
        imgArray_monster[0] = R.drawable.agnaktor;
        nameArray_monster[0] = "Agnaktor";
        imgArray_monster[1] = R.drawable.akantor;
        nameArray_monster[1] = "Akantor";
        imgArray_monster[2] = R.drawable.amatsu;
        nameArray_monster[2] = "Amatsu";
        imgArray_monster[3] = R.drawable.arzuros;
        nameArray_monster[3] = "Arzuros";
        imgArray_monster[4] = R.drawable.astalos;
        nameArray_monster[4] = "Astalos";
        imgArray_monster[5] = R.drawable.blangonga;
        nameArray_monster[5] = "Blangonga";
        imgArray_monster[6] = R.drawable.brachydios;
        nameArray_monster[6] = "Brachydios";
        imgArray_monster[7] = R.drawable.bulldrome;
        nameArray_monster[7] = "Bulldrome";
        imgArray_monster[8] = R.drawable.cephadrome;
        nameArray_monster[8] = "Cephadrome";
        imgArray_monster[9] = R.drawable.chameleos;
        nameArray_monster[9] = "Chameleos";
        imgArray_monster[10] = R.drawable.crystalbearduragaan;
        nameArray_monster[10] = "Crystalbear Duragaan";
        imgArray_monster[11] = R.drawable.daimyohermitaur;
        nameArray_monster[11] = "Daimyo Hermitaur";
        imgArray_monster[12] = R.drawable.deadeyeyiangaruga;
        nameArray_monster[12] = "Deadeye Yian Garuga";
        imgArray_monster[13] = R.drawable.deviljho;
        nameArray_monster[13] = "Deviljho";
        imgArray_monster[14] = R.drawable.dreadkingrathalos;
        nameArray_monster[14] = "Dread King Rathalos";
        imgArray_monster[15] = R.drawable.dreadqueenrathian;
        nameArray_monster[15] = "Dread Queen Rathian";
        imgArray_monster[16] = R.drawable.drilltusktetsucabra;
        nameArray_monster[16] = "Drilltusk Tetsucabra";
        imgArray_monster[17] = R.drawable.duramboros;
        nameArray_monster[17] = "Duramboros";
        imgArray_monster[18] = R.drawable.furiousrajang;
        nameArray_monster[18] = "Furius Rajang";
        imgArray_monster[19] = R.drawable.gammoth;
        nameArray_monster[19] = "Gammoth";
        imgArray_monster[20] = R.drawable.glavenus;
        nameArray_monster[20] = "Glavenus";
        imgArray_monster[21] = R.drawable.goldrathian;
        nameArray_monster[21] = "Gold Rathian";
        imgArray_monster[22] = R.drawable.goremagala;
        nameArray_monster[22] = "Gore Magala";
        imgArray_monster[23] = R.drawable.greatmaccao;
        nameArray_monster[23] = "Great Maccao";
        imgArray_monster[24] = R.drawable.grimclawtigrex;
        nameArray_monster[24] = "Grimclaw tigrex";
        imgArray_monster[25] = R.drawable.gypceros;
        nameArray_monster[25] = "Gypceros";
        imgArray_monster[26] = R.drawable.hellbladeglavenus;
        nameArray_monster[26] = "HellBlade Glavenus";
        imgArray_monster[27] = R.drawable.iodrome;
        nameArray_monster[27] = "Iodrome";
        imgArray_monster[28] = R.drawable.kechawacha;
        nameArray_monster[28] = "Kecha Wacha";
        imgArray_monster[29] = R.drawable.khezu;
        nameArray_monster[29] = "Khezu";
        imgArray_monster[30] = R.drawable.kirin;
        nameArray_monster[30] = "Kirin";
        imgArray_monster[31] = R.drawable.kushaladaora;
        nameArray_monster[31] = "Kushala Daora";
        imgArray_monster[32] = R.drawable.lagiacrus;
        nameArray_monster[32] = "Lagiacrus";
        imgArray_monster[33] = R.drawable.lagombi;
        nameArray_monster[33] = "Lagombi";
        imgArray_monster[34] = R.drawable.lavasioth;
        nameArray_monster[34] = "Lavasioth";
        imgArray_monster[35] = R.drawable.malfestio;
        nameArray_monster[35] = "Malfestio";
        imgArray_monster[36] = R.drawable.mizutsune;
        nameArray_monster[36] = "Mizutsune";
        imgArray_monster[37] = R.drawable.najarala;
        nameArray_monster[37] = "Najarala";
        imgArray_monster[38] = R.drawable.nakarkos;
        nameArray_monster[38] = "Nakarkos";
        imgArray_monster[39] = R.drawable.nargacuga;
        nameArray_monster[39] = "Nargacuga";
        imgArray_monster[40] = R.drawable.nibelsnarf;
        nameArray_monster[40] = "Nibelsnarf";
        imgArray_monster[41] = R.drawable.plesioth;
        nameArray_monster[41] = "Plesioth";
        imgArray_monster[42] = R.drawable.rajang;
        nameArray_monster[42] = "Rajang";
        imgArray_monster[43] = R.drawable.rathalos;
        nameArray_monster[43] = "Rathalos";
        imgArray_monster[44] = R.drawable.rathian;
        nameArray_monster[44] = "Rathian";
        imgArray_monster[45] = R.drawable.redhelmarzuros;
        nameArray_monster[45] = "RedHelm Arzuros";
        imgArray_monster[46] = R.drawable.royalludroth;
        nameArray_monster[46] = "Royal Ludroth";
        imgArray_monster[47] = R.drawable.savagedeviljho;
        nameArray_monster[47] = "Savage Deviljho";
        imgArray_monster[48] = R.drawable.seltas;
        nameArray_monster[48] = "Seltas";
        imgArray_monster[49] = R.drawable.seltasqueen;
        nameArray_monster[49] = "Seltas Queen";
        imgArray_monster[50] = R.drawable.seregios;
        nameArray_monster[50] = "Seregios";
        imgArray_monster[51] = R.drawable.shagarumagala;
        nameArray_monster[51] = "Shagaru Magala";
        imgArray_monster[52] = R.drawable.silverrathalos;
        nameArray_monster[52] = "Silver Rathalos";
        imgArray_monster[53] = R.drawable.silverwindnargacuga;
        nameArray_monster[53] = "SilverWind Nargacuga";
        imgArray_monster[54] = R.drawable.snowbaronlagombi;
        nameArray_monster[54] = "SnowBaron Lagombi";
        imgArray_monster[55] = R.drawable.stonefisthermitaur;
        nameArray_monster[55] = "StoneFist Hermitaur";
        imgArray_monster[56] = R.drawable.teostra;
        nameArray_monster[56] = "Teostra";
        imgArray_monster[57] = R.drawable.tetsucabra;
        nameArray_monster[57] = "Tetsucabra";
        imgArray_monster[58] = R.drawable.thunderlordzinogre;
        nameArray_monster[58] = "ThunderLord Zinogre";
        imgArray_monster[59] = R.drawable.tigrex;
        nameArray_monster[59] = "Tigrex";
        imgArray_monster[60] = R.drawable.unknown;
        nameArray_monster[60] = "Alatreon";
        imgArray_monster[61] = R.drawable.uragaan;
        nameArray_monster[61] = "Uragaan";
        imgArray_monster[62] = R.drawable.velocidrome;
        nameArray_monster[62] = "Velocidrome";
        imgArray_monster[63] = R.drawable.volvidon;
        nameArray_monster[63] = "Volvidon";
        imgArray_monster[64] = R.drawable.yiangaruga;
        nameArray_monster[64] = "Yian Garuga";
        imgArray_monster[65] = R.drawable.yiankutku;
        nameArray_monster[65] = "Yian Kut-ku";
        imgArray_monster[66] = R.drawable.zamtrios;
        nameArray_monster[66] = "Zamtrios";
        imgArray_weapon[67] = R.drawable.gendrome;
        nameArray_monster[67] = "Gendrome";
        imgArray_monster[68] = R.drawable.shogunceanataur;
        nameArray_monster[68] = "Shogun Ceanataur";
        imgArray_monster[69] = R.drawable.ukanlos;
        nameArray_monster[69] = "Ukandlos";
    }

    public void get_weapon(View v) {
        img_weapon = (ImageView) findViewById(R.id.img_weapon);
        name_weapon = (TextView) findViewById(R.id.name_weapon);
        Random r = new Random();
        int i = r.nextInt(15 - 0) + 0;
        img_weapon.setImageResource(imgArray_weapon[i]);
        name_weapon.setBackgroundColor(Color.WHITE);
        name_weapon.setTextColor(Color.BLACK);
        name_weapon.setText(nameArray_weapon[i]);

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.itembrowse);
        mp.start();
    }

    public void get_style(View v) {
        name_style = (TextView) findViewById(R.id.name_style);
        Random r = new Random();
        int i = r.nextInt(4 - 0) + 0;
        name_style.setBackgroundColor(Color.WHITE);
        name_style.setTextColor(Color.BLACK);
        name_style.setText(nameArray_style[i]);

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.itemselect);
        mp.start();
    }

    public void get_monster(View v) {
        img_monster = (ImageView) findViewById(R.id.img_monster);
        name_monster = (TextView) findViewById(R.id.name_monster);
        Random r = new Random();
        int i = r.nextInt(70 - 0) + 0;
        img_monster.setImageResource(imgArray_monster[i]);
        name_monster.setBackgroundColor(Color.WHITE);
        name_monster.setTextColor(Color.BLACK);
        name_monster.setText(nameArray_monster[i]);

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.mhgamestart);
        mp.start();
    }
}
