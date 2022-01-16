package com.example.drinki;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;


public class Datebase extends SQLiteOpenHelper {


    /* Inner class that defines the table contents */
    public static class FeedEntry implements BaseColumns {
        public static final String TABLE_NAME = "Barek";
        public static final String COLUMN_nazwa = "nazwa";
        public static final String COLUMN_wodka = "wodka";
        public static final String COLUMN_scotch_whisky = "scotch_whisky";
        public static final String COLUMN_burbon_whisky = "burbon_whisky";
        public static final String COLUMN_american_blended_whiskey = "american_blended_whiskey";
        public static final String COLUMN_apple_brandy = "apple_brandy";
        public static final String COLUMN_cherry_brandy = "cherry_brandy";
        public static final String COLUMN_irish_whisky = "irish_whisky";
        public static final String COLUMN_metaxa_brandy = "metaxa_brandy";
        public static final String COLUMN_white_rum = "white_rum";
        public static final String COLUMN_golden_rum = "golden_rum";
        public static final String COLUMN_dark_rum = "dark_rum";
        public static final String COLUMN_dry_gin_silver = "dry_gin_silver";
        public static final String COLUMN_tequila_blanco = "tequila_blanco";
        public static final String COLUMN_tequila_reposado = "tequila_reposado";
        public static final String COLUMN_sambuca = "sambuca";
        public static final String COLUMN_jagermeister = "jagermeister";
        public static final String COLUMN_vermout_martini_dry = "vermout_martini_dry";
        public static final String COLUMN_vermout_martini_rosso = "vermout_martini_rosso";
        public static final String COLUMN_vermout_martini_bianco = "vermout_martini_bianco";
        public static final String COLUMN_vermout_cinzano_dry = "vermout_cinzano_dry";
        public static final String COLUMN_vermout_cinzano_rosso = "vermout_cinzano_rosso";
        public static final String COLUMN_vermout_cinzano_bianco = "vermout_cinzano_bianco";
        public static final String COLUMN_maraschino = "maraschino";
        public static final String COLUMN_banana_likier = "banana_likier";
        public static final String COLUMN_triple_sec = "triple_sec";
        public static final String COLUMN_amaretto_likier = "amaretto_likier";
        public static final String COLUMN_peach_likier = "peach_likier";
        public static final String COLUMN_blue_curacao_likier = "blue_curacao_likier";
        public static final String COLUMN_dry_orange_curacao = "dry_orange_curacao";
        public static final String COLUMN_peppermint_likier = "peppermint_likier";
        public static final String COLUMN_coffee_likier = "coffee_likier";
        public static final String COLUMN_cocosowy_likier = "cocosowy_likier";
        public static final String COLUMN_irish_cream_liqueur = "irish_cream_liqueur";
        public static final String COLUMN_strawberry_liqueur = "strawberry_liqueur";
        public static final String COLUMN_advocaat = "advocaat";
        public static final String COLUMN_malibu = "malibu";
        public static final String COLUMN_sliwowica = "sliwowica";
        public static final String COLUMN_angostura_bitters = "angostura_bitters";
        public static final String COLUMN_orange_bitters = "orange_bitters";
        public static final String COLUMN_campari_bitter = "campari_bitter";
        public static final String COLUMN_mandarinetto = "mandarinetto";
        public static final String COLUMN_cydr = "cydr";
        public static final String COLUMN_grenadine = "grenadine";
        public static final String COLUMN_syrop_malinowy = "syrop_malinowy";
        public static final String COLUMN_syrop_truskawkowy = "syrop_truskawkowy";
        public static final String COLUMN_syrop_wisniowy = "syrop_wisniowy";
        public static final String COLUMN_syrop_cukrowy = "syrop_cukrowy";
        public static final String COLUMN_sok_cytrynowy = "sok_cytrynowy";
        public static final String COLUMN_sok_limonkowy = "sok_limonkowy";
        public static final String COLUMN_sok_pomaranczowy = "sok_pomaranczowy";
        public static final String COLUMN_sok_mandarynkowy = "sok_mandarynkowy";
        public static final String COLUMN_sok_grejpfrutowy = "sok_grejpfrutowy";
        public static final String COLUMN_sok_annasowy = "sok_annasowy";
        public static final String COLUMN_sok_jablkowy = "sok_jablkowy";
        public static final String COLUMN_sok_zurawinowy = "sok_zurawinowy";
        public static final String COLUMN_sok_z_czerwonej_porzeczki = "sok_z_czerwonej_porzeczki";
        public static final String COLUMN_nektar_mango = "nektar_mango";
        public static final String COLUMN_sok_pomidorowy = "sok_pomidorowy";
        public static final String COLUMN_coca_cola = "coca_cola";
        public static final String COLUMN_seven_up = "seven_up";
        public static final String COLUMN_schweppes_bitter_lemon_soda = "schweppes_bitter_lemon_soda";
        public static final String COLUMN_schweppes_bitter_orange_soda = "schweppes_bitter_orange_soda";
        public static final String COLUMN_schweppes_tonic_soda = "schweppes_tonic_soda";
        public static final String COLUMN_slodka_smietanka = "slodka_smietanka";
        public static final String COLUMN_woda_sodowa = "woda_sodowa";
        public static final String COLUMN_zimny_napar_kawy = "zimny_napar_kawy";
        public static final String COLUMN_goracy_napar_kawy = "goracy_napar_kawy";
        public static final String COLUMN_goracy_napar_herbaty = "goracy_napar_herbaty";
        public static final String COLUMN_cukier_puder = "cukier_puder";
        public static final String COLUMN_cynamon = "cynamon";
        public static final String COLUMN_miod = "miod";
        public static final String COLUMN_tabasco = "tabasco";
        public static final String COLUMN_sproszkowana_czekolada = "sproszkowana_czekolada";
        public static final String COLUMN_zimne_mleko = "zimne_mleko";
        public static final String COLUMN_bita_smietana = "bita_smietana";
        public static final String COLUMN_bialko_jajka = "bialko_jajka";
        public static final String COLUMN_zoltko_jajka = "zoltko_jajka";
        public static final String COLUMN_inne = "inne";
        public static final String COLUMN_dekoracja = "dekoracja";
        public static final String COLUMN_szklo = "szklo";
        public static final String COLUMN_rodzaj = "rodzaj";
        public static final String COLUMN_wykonanie = "wykonanie";
        public static final String COLUMN_ocena = "ocena";
        public static final String COLUMN_ilosc = "ilosc";

    }


    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + FeedEntry.TABLE_NAME + " (" +
                    FeedEntry._ID + " INTEGER PRIMARY KEY," +
                    FeedEntry.COLUMN_nazwa + " TEXT," +
                    FeedEntry.COLUMN_wodka + " TEXT," +
                    FeedEntry.COLUMN_scotch_whisky + " TEXT," +
                    FeedEntry.COLUMN_burbon_whisky + " TEXT," +
                    FeedEntry.COLUMN_american_blended_whiskey + " TEXT," +
                    FeedEntry.COLUMN_apple_brandy + " TEXT," +
                    FeedEntry.COLUMN_cherry_brandy + " TEXT," +
                    FeedEntry.COLUMN_irish_whisky + " TEXT," +
                    FeedEntry.COLUMN_metaxa_brandy + " TEXT," +
                    FeedEntry.COLUMN_white_rum + " TEXT," +
                    FeedEntry.COLUMN_golden_rum + " TEXT," +
                    FeedEntry.COLUMN_dark_rum + " TEXT," +
                    FeedEntry.COLUMN_dry_gin_silver + " TEXT," +
                    FeedEntry.COLUMN_tequila_blanco + " TEXT," +
                    FeedEntry.COLUMN_tequila_reposado + " TEXT," +
                    FeedEntry.COLUMN_sambuca + " TEXT," +
                    FeedEntry.COLUMN_jagermeister + " TEXT," +
                    FeedEntry.COLUMN_vermout_martini_dry + " TEXT," +
                    FeedEntry.COLUMN_vermout_martini_rosso + " TEXT," +
                    FeedEntry.COLUMN_vermout_martini_bianco + " TEXT," +
                    FeedEntry.COLUMN_vermout_cinzano_dry + " TEXT," +
                    FeedEntry.COLUMN_vermout_cinzano_rosso + " TEXT," +
                    FeedEntry.COLUMN_vermout_cinzano_bianco + " TEXT," +
                    FeedEntry.COLUMN_maraschino + " TEXT," +
                    FeedEntry.COLUMN_banana_likier + " TEXT," +
                    FeedEntry.COLUMN_triple_sec + " TEXT," +
                    FeedEntry.COLUMN_amaretto_likier + " TEXT," +
                    FeedEntry.COLUMN_peach_likier + " TEXT," +
                    FeedEntry.COLUMN_blue_curacao_likier + " TEXT," +
                    FeedEntry.COLUMN_dry_orange_curacao + " TEXT," +
                    FeedEntry.COLUMN_peppermint_likier + " TEXT," +
                    FeedEntry.COLUMN_coffee_likier + " TEXT," +
                    FeedEntry.COLUMN_cocosowy_likier + " TEXT," +
                    FeedEntry.COLUMN_irish_cream_liqueur + " TEXT," +
                    FeedEntry.COLUMN_strawberry_liqueur + " TEXT," +
                    FeedEntry.COLUMN_advocaat + " TEXT," +
                    FeedEntry.COLUMN_malibu + " TEXT," +
                    FeedEntry.COLUMN_sliwowica + " TEXT," +
                    FeedEntry.COLUMN_angostura_bitters + " TEXT," +
                    FeedEntry.COLUMN_orange_bitters + " TEXT," +
                    FeedEntry.COLUMN_campari_bitter + " TEXT," +
                    FeedEntry.COLUMN_mandarinetto + " TEXT," +
                    FeedEntry.COLUMN_cydr + " TEXT," +
                    FeedEntry.COLUMN_grenadine + " TEXT," +
                    FeedEntry.COLUMN_syrop_malinowy + " TEXT," +
                    FeedEntry.COLUMN_syrop_truskawkowy + " TEXT," +
                    FeedEntry.COLUMN_syrop_wisniowy + " TEXT," +
                    FeedEntry.COLUMN_syrop_cukrowy + " TEXT," +
                    FeedEntry.COLUMN_sok_cytrynowy + " TEXT," +
                    FeedEntry.COLUMN_sok_limonkowy + " TEXT," +
                    FeedEntry.COLUMN_sok_pomaranczowy + " TEXT," +
                    FeedEntry.COLUMN_sok_mandarynkowy + " TEXT," +
                    FeedEntry.COLUMN_sok_grejpfrutowy + " TEXT," +
                    FeedEntry.COLUMN_sok_annasowy + " TEXT," +
                    FeedEntry.COLUMN_sok_jablkowy + " TEXT," +
                    FeedEntry.COLUMN_sok_zurawinowy + " TEXT," +
                    FeedEntry.COLUMN_sok_z_czerwonej_porzeczki + " TEXT," +
                    FeedEntry.COLUMN_nektar_mango + " TEXT," +
                    FeedEntry.COLUMN_sok_pomidorowy + " TEXT," +
                    FeedEntry.COLUMN_coca_cola + " TEXT," +
                    FeedEntry.COLUMN_seven_up + " TEXT," +
                    FeedEntry.COLUMN_schweppes_bitter_lemon_soda + " TEXT," +
                    FeedEntry.COLUMN_schweppes_bitter_orange_soda + " TEXT," +
                    FeedEntry.COLUMN_schweppes_tonic_soda + " TEXT," +
                    FeedEntry.COLUMN_slodka_smietanka + " TEXT," +
                    FeedEntry.COLUMN_woda_sodowa + " TEXT," +
                    FeedEntry.COLUMN_zimny_napar_kawy + " TEXT," +
                    FeedEntry.COLUMN_goracy_napar_kawy + " TEXT," +
                    FeedEntry.COLUMN_goracy_napar_herbaty + " TEXT," +
                    FeedEntry.COLUMN_cukier_puder + " TEXT," +
                    FeedEntry.COLUMN_cynamon + " TEXT," +
                    FeedEntry.COLUMN_miod + " TEXT," +
                    FeedEntry.COLUMN_tabasco + " TEXT," +
                    FeedEntry.COLUMN_sproszkowana_czekolada + " TEXT," +
                    FeedEntry.COLUMN_zimne_mleko + " TEXT," +
                    FeedEntry.COLUMN_bita_smietana + " TEXT," +
                    FeedEntry.COLUMN_bialko_jajka + " TEXT," +
                    FeedEntry.COLUMN_zoltko_jajka + " TEXT," +
                    FeedEntry.COLUMN_inne + " TEXT," +
                    FeedEntry.COLUMN_dekoracja + " TEXT," +
                    FeedEntry.COLUMN_szklo + " TEXT," +
                    FeedEntry.COLUMN_rodzaj + " TEXT," +
                    FeedEntry.COLUMN_wykonanie + " TEXT," +
                    FeedEntry.COLUMN_ocena + " TEXT," +
                    FeedEntry.COLUMN_ilosc + " TEXT)";


    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + FeedEntry.TABLE_NAME;

    public static final int DATABASE_VERSION = 12;
    public static final String DATABASE_NAME = "FeedReader.db";


    public Datebase(Context context, String DATABASE_NAME) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);

    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }



    public void setAllDrink(String nazwa, String  wodka, String scotch_whisky, String burbon_whisky, String american_blended_whiskey,
                            String apple_brandy, String cherry_brandy, String irish_whisky, String metaxa_brandy,
                            String white_rum, String golden_rum, String dark_rum, String dry_gin_silver, String tequila_blanco, String tequila_reposado,
                            String sambuca, String jagermeister, String vermout_martini_dry, String vermout_martini_rosso,
                            String vermout_martini_bianco, String vermout_cinzano_dry, String vermout_cinzano_rosso,
                            String vermout_cinzano_bianco, String maraschino, String banana_likier, String triple_sec,
                            String amaretto_likier, String peach_likier, String blue_curacao_likier, String dry_orange_curacao,
                            String peppermint_likier, String coffee_likier, String cocosowy_likier, String irish_cream_liqueur,
                            String strawberry_liqueur, String advocaat, String malibu, String sliwowica, String angostura_bitters,
                            String orange_bitters, String campari_bitter, String mandarinetto, String cydr, String grenadine,
                            String syrop_malinowy, String syrop_truskawkowy, String syrop_wisniowy, String syrop_cukrowy,
                            String sok_cytrynowy, String sok_limonkowy, String sok_pomaranczowy, String sok_mandarynkowy,
                            String sok_grejpfrutowy, String sok_annasowy, String sok_jablkowy, String sok_zurawinowy,
                            String sok_z_czerwonej_porzeczki, String nektar_mango, String sok_pomidorowy, String coca_cola,
                            String seven_up, String schweppes_bitter_lemon_soda, String schweppes_bitter_orange_soda,
                            String schweppes_tonic_soda, String slodka_smietanka, String woda_sodowa, String zimny_napar_kawy,
                            String goracy_napar_kawy, String goracy_napar_herbaty, String cukier_puder, String cynamon, String miod,
                            String tabasco, String sproszkowana_czekolada, String zimne_mleko, String bita_smietana,
                            String bialko_jajka, String zoltko_jajka, String inne, String dekoracja, String szklo,
                            String rodzaj, String wykonanie, String ocena, String ilosc) {

        // Gets the data repository in write mode
        SQLiteDatabase db = getWritableDatabase();

        // Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();

        values.put(FeedEntry.COLUMN_nazwa, nazwa);
        values.put(FeedEntry.COLUMN_wodka, wodka);
        values.put(FeedEntry.COLUMN_scotch_whisky, scotch_whisky);
        values.put(FeedEntry.COLUMN_burbon_whisky, burbon_whisky);
        values.put(FeedEntry.COLUMN_american_blended_whiskey, american_blended_whiskey);
        values.put(FeedEntry.COLUMN_apple_brandy, apple_brandy);
        values.put(FeedEntry.COLUMN_cherry_brandy, cherry_brandy);
        values.put(FeedEntry.COLUMN_irish_whisky, irish_whisky);
        values.put(FeedEntry.COLUMN_metaxa_brandy, metaxa_brandy);
        values.put(FeedEntry.COLUMN_white_rum, white_rum);
        values.put(FeedEntry.COLUMN_golden_rum, golden_rum);
        values.put(FeedEntry.COLUMN_dark_rum, dark_rum);
        values.put(FeedEntry.COLUMN_dry_gin_silver, dry_gin_silver);
        values.put(FeedEntry.COLUMN_tequila_blanco, tequila_blanco);
        values.put(FeedEntry.COLUMN_tequila_reposado, tequila_reposado);
        values.put(FeedEntry.COLUMN_sambuca, sambuca);
        values.put(FeedEntry.COLUMN_jagermeister, jagermeister);
        values.put(FeedEntry.COLUMN_vermout_martini_dry, vermout_martini_dry);
        values.put(FeedEntry.COLUMN_vermout_martini_rosso, vermout_martini_rosso);
        values.put(FeedEntry.COLUMN_vermout_martini_bianco, vermout_martini_bianco);
        values.put(FeedEntry.COLUMN_vermout_cinzano_dry, vermout_cinzano_dry);
        values.put(FeedEntry.COLUMN_vermout_cinzano_rosso, vermout_cinzano_rosso);
        values.put(FeedEntry.COLUMN_vermout_cinzano_bianco, vermout_cinzano_bianco);
        values.put(FeedEntry.COLUMN_maraschino, maraschino);
        values.put(FeedEntry.COLUMN_banana_likier, banana_likier);
        values.put(FeedEntry.COLUMN_triple_sec, triple_sec);
        values.put(FeedEntry.COLUMN_amaretto_likier, amaretto_likier);
        values.put(FeedEntry.COLUMN_peach_likier, peach_likier);
        values.put(FeedEntry.COLUMN_blue_curacao_likier, blue_curacao_likier);
        values.put(FeedEntry.COLUMN_dry_orange_curacao, dry_orange_curacao);
        values.put(FeedEntry.COLUMN_peppermint_likier, peppermint_likier);
        values.put(FeedEntry.COLUMN_coffee_likier, coffee_likier);
        values.put(FeedEntry.COLUMN_cocosowy_likier, cocosowy_likier);
        values.put(FeedEntry.COLUMN_irish_cream_liqueur, irish_cream_liqueur);
        values.put(FeedEntry.COLUMN_strawberry_liqueur, strawberry_liqueur);
        values.put(FeedEntry.COLUMN_advocaat, advocaat);
        values.put(FeedEntry.COLUMN_malibu, malibu);
        values.put(FeedEntry.COLUMN_sliwowica, sliwowica);
        values.put(FeedEntry.COLUMN_angostura_bitters, angostura_bitters);
        values.put(FeedEntry.COLUMN_orange_bitters, orange_bitters);
        values.put(FeedEntry.COLUMN_campari_bitter, campari_bitter);
        values.put(FeedEntry.COLUMN_mandarinetto, mandarinetto);
        values.put(FeedEntry.COLUMN_cydr, cydr);
        values.put(FeedEntry.COLUMN_grenadine, grenadine);
        values.put(FeedEntry.COLUMN_syrop_malinowy, syrop_malinowy);
        values.put(FeedEntry.COLUMN_syrop_truskawkowy, syrop_truskawkowy);
        values.put(FeedEntry.COLUMN_syrop_wisniowy, syrop_wisniowy);
        values.put(FeedEntry.COLUMN_syrop_cukrowy, syrop_cukrowy);
        values.put(FeedEntry.COLUMN_sok_cytrynowy, sok_cytrynowy);
        values.put(FeedEntry.COLUMN_sok_limonkowy, sok_limonkowy);
        values.put(FeedEntry.COLUMN_sok_pomaranczowy, sok_pomaranczowy);
        values.put(FeedEntry.COLUMN_sok_mandarynkowy, sok_mandarynkowy);
        values.put(FeedEntry.COLUMN_sok_grejpfrutowy, sok_grejpfrutowy);
        values.put(FeedEntry.COLUMN_sok_annasowy, sok_annasowy);
        values.put(FeedEntry.COLUMN_sok_jablkowy, sok_jablkowy);
        values.put(FeedEntry.COLUMN_sok_zurawinowy, sok_zurawinowy);
        values.put(FeedEntry.COLUMN_sok_z_czerwonej_porzeczki, sok_z_czerwonej_porzeczki);
        values.put(FeedEntry.COLUMN_nektar_mango, nektar_mango);
        values.put(FeedEntry.COLUMN_sok_pomidorowy, sok_pomidorowy);
        values.put(FeedEntry.COLUMN_coca_cola, coca_cola);
        values.put(FeedEntry.COLUMN_seven_up, seven_up);
        values.put(FeedEntry.COLUMN_schweppes_bitter_lemon_soda, schweppes_bitter_lemon_soda);
        values.put(FeedEntry.COLUMN_schweppes_bitter_orange_soda, schweppes_bitter_orange_soda);
        values.put(FeedEntry.COLUMN_schweppes_tonic_soda, schweppes_tonic_soda);
        values.put(FeedEntry.COLUMN_slodka_smietanka, slodka_smietanka);
        values.put(FeedEntry.COLUMN_woda_sodowa, woda_sodowa);
        values.put(FeedEntry.COLUMN_zimny_napar_kawy, zimny_napar_kawy);
        values.put(FeedEntry.COLUMN_goracy_napar_kawy, goracy_napar_kawy);
        values.put(FeedEntry.COLUMN_goracy_napar_herbaty, goracy_napar_herbaty);
        values.put(FeedEntry.COLUMN_cukier_puder, cukier_puder);
        values.put(FeedEntry.COLUMN_cynamon, cynamon);
        values.put(FeedEntry.COLUMN_tabasco, tabasco);
        values.put(FeedEntry.COLUMN_miod, miod);
        values.put(FeedEntry.COLUMN_sproszkowana_czekolada, sproszkowana_czekolada);
        values.put(FeedEntry.COLUMN_zimne_mleko, zimne_mleko);
        values.put(FeedEntry.COLUMN_bita_smietana, bita_smietana);
        values.put(FeedEntry.COLUMN_bialko_jajka, bialko_jajka);
        values.put(FeedEntry.COLUMN_zoltko_jajka, zoltko_jajka);
        values.put(FeedEntry.COLUMN_inne, inne);
        values.put(FeedEntry.COLUMN_dekoracja, dekoracja);
        values.put(FeedEntry.COLUMN_szklo, szklo);
        values.put(FeedEntry.COLUMN_rodzaj, rodzaj);
        values.put(FeedEntry.COLUMN_wykonanie, wykonanie);
        values.put(FeedEntry.COLUMN_ocena, ocena);
        values.put(FeedEntry.COLUMN_ilosc, ilosc);

        // Insert the new row, returning the primary key value of the new row
        long newRowId = db.insert(FeedEntry.TABLE_NAME, null, values);

    }


    public Cursor getAllDate() {

        SQLiteDatabase db = getReadableDatabase();

        // Define a projection that specifies which columns from the database
        // you will actually use after this query.
        String[] columns = {
                FeedEntry.COLUMN_nazwa,
                FeedEntry.COLUMN_wodka,
                FeedEntry.COLUMN_scotch_whisky,
                FeedEntry.COLUMN_burbon_whisky,
                FeedEntry.COLUMN_american_blended_whiskey,
                FeedEntry.COLUMN_apple_brandy,
                FeedEntry.COLUMN_cherry_brandy,
                FeedEntry.COLUMN_irish_whisky,
                FeedEntry.COLUMN_metaxa_brandy,
                FeedEntry.COLUMN_white_rum,
                FeedEntry.COLUMN_golden_rum,
                FeedEntry.COLUMN_dark_rum,
                FeedEntry.COLUMN_dry_gin_silver,
                FeedEntry.COLUMN_tequila_blanco,
                FeedEntry.COLUMN_tequila_reposado,
                FeedEntry.COLUMN_sambuca,
                FeedEntry.COLUMN_jagermeister,
                FeedEntry.COLUMN_vermout_martini_dry,
                FeedEntry.COLUMN_vermout_martini_rosso,
                FeedEntry.COLUMN_vermout_martini_bianco,
                FeedEntry.COLUMN_vermout_cinzano_dry,
                FeedEntry.COLUMN_vermout_cinzano_rosso,
                FeedEntry.COLUMN_vermout_cinzano_bianco,
                FeedEntry.COLUMN_maraschino,
                FeedEntry.COLUMN_banana_likier,
                FeedEntry.COLUMN_triple_sec,
                FeedEntry.COLUMN_amaretto_likier,
                FeedEntry.COLUMN_peach_likier,
                FeedEntry.COLUMN_blue_curacao_likier,
                FeedEntry.COLUMN_dry_orange_curacao,
                FeedEntry.COLUMN_peppermint_likier,
                FeedEntry.COLUMN_coffee_likier,
                FeedEntry.COLUMN_cocosowy_likier,
                FeedEntry.COLUMN_irish_cream_liqueur,
                FeedEntry.COLUMN_strawberry_liqueur,
                FeedEntry.COLUMN_advocaat,
                FeedEntry.COLUMN_malibu,
                FeedEntry.COLUMN_sliwowica,
                FeedEntry.COLUMN_angostura_bitters,
                FeedEntry.COLUMN_orange_bitters,
                FeedEntry.COLUMN_campari_bitter,
                FeedEntry.COLUMN_mandarinetto,
                FeedEntry.COLUMN_cydr,
                FeedEntry.COLUMN_grenadine,
                FeedEntry.COLUMN_syrop_malinowy,
                FeedEntry.COLUMN_syrop_truskawkowy,
                FeedEntry.COLUMN_syrop_wisniowy,
                FeedEntry.COLUMN_syrop_cukrowy,
                FeedEntry.COLUMN_sok_cytrynowy,
                FeedEntry.COLUMN_sok_limonkowy,
                FeedEntry.COLUMN_sok_pomaranczowy,
                FeedEntry.COLUMN_sok_mandarynkowy,
                FeedEntry.COLUMN_sok_grejpfrutowy,
                FeedEntry.COLUMN_sok_annasowy,
                FeedEntry.COLUMN_sok_jablkowy,
                FeedEntry.COLUMN_sok_zurawinowy,
                FeedEntry.COLUMN_sok_z_czerwonej_porzeczki,
                FeedEntry.COLUMN_nektar_mango,
                FeedEntry.COLUMN_sok_pomidorowy,
                FeedEntry.COLUMN_coca_cola,
                FeedEntry.COLUMN_seven_up,
                FeedEntry.COLUMN_schweppes_bitter_lemon_soda,
                FeedEntry.COLUMN_schweppes_bitter_orange_soda,
                FeedEntry.COLUMN_schweppes_tonic_soda,
                FeedEntry.COLUMN_slodka_smietanka,
                FeedEntry.COLUMN_woda_sodowa,
                FeedEntry.COLUMN_zimny_napar_kawy,
                FeedEntry.COLUMN_goracy_napar_kawy,
                FeedEntry.COLUMN_goracy_napar_herbaty,
                FeedEntry.COLUMN_cukier_puder,
                FeedEntry.COLUMN_cynamon,
                FeedEntry.COLUMN_miod,
                FeedEntry.COLUMN_tabasco,
                FeedEntry.COLUMN_sproszkowana_czekolada,
                FeedEntry.COLUMN_zimne_mleko,
                FeedEntry.COLUMN_bita_smietana,
                FeedEntry.COLUMN_bialko_jajka,
                FeedEntry.COLUMN_zoltko_jajka,
                FeedEntry.COLUMN_inne,
                FeedEntry.COLUMN_dekoracja,
                FeedEntry.COLUMN_szklo,
                FeedEntry.COLUMN_rodzaj,
                FeedEntry.COLUMN_wykonanie,
                FeedEntry.COLUMN_ocena,
                FeedEntry.COLUMN_ilosc,
        };

        return db.query("Barek", columns, null, null, null  , null , null, null);

    }

//    public Cursor getDrink(String s, String nazwa, String wodka, String scotch_whisky, String burbon_whisky, String american_blended_whiskey,
//                           String apple_brandy, String cherry_brandy, String irish_whisky, String metaxa_brandy, String white_rum,
//                           String golden_rum, String dark_rum, String dry_gin_silver, String tequila_blanco, String tequila_reposado,
//                           String sambuca, String jagermeister, String vermout_martini_dry, String vermout_martini_rosso, String vermout_martini_bianco,
//                           String vermout_cinzano_dry, String vermout_cinzano_rosso, String vermout_cinzano_bianco, String maraschino, String banana_likier,
//                           String triple_sec, String amaretto_likier, String peach_likier, String blue_curacao_likier, String dry_orange_curacao,
//                           String peppermint_likier, String coffee_likier, String cocosowy_likier, String irish_cream_liqueur, String strawberry_liqueur,
//                           String advocaat, String malibu, String sliwowica, String angostura_bitters, String orange_bitters, String campari_bitter,
//                           String mandarinetto, String cydr, String grenadine, String syrop_malinowy, String syrop_truskawkowy, String syrop_wisniowy,
//                           String syrop_cukrowy, String sok_cytrynowy, String sok_limonkowy, String sok_pomaranczowy, String sok_mandarynkowy,
//                           String sok_grejpfrutowy, String sok_annasowy, String sok_jablkowy, String sok_zurawinowy, String sok_z_czerwonej_porzeczki,
//                           String nektar_mango, String sok_pomidorowy, String coca_cola, String seven_up, String schweppes_bitter_lemon_soda,
//                           String schweppes_bitter_orange_soda, String schweppes_tonic_soda, String slodka_smietanka, String woda_sodowa,
//                           String zimny_napar_kawy, String goracy_napar_kawy, String goracy_napar_herbaty, String cukier_puder, String cynamon,
//                           String tabasco, String sproszkowana_czekolada, String zimne_mleko, String bita_smietana, String bialko_jajka,
//                           String zoltko_jajka, String inne, String dekoracja, String szklo, String rodzaj, String wykonanie, String ocena) {
//
//        SQLiteDatabase db = getReadableDatabase();
//
//        // Define a projection that specifies which columns from the database
//        // you will actually use after this query.
//        String[] columns = {
//                FeedEntry.COLUMN_nazwa,
//                FeedEntry.COLUMN_wodka,
//                FeedEntry.COLUMN_scotch_whisky,
//                FeedEntry.COLUMN_burbon_whisky,
//                FeedEntry.COLUMN_american_blended_whiskey,
//                FeedEntry.COLUMN_apple_brandy,
//                FeedEntry.COLUMN_cherry_brandy,
//                FeedEntry.COLUMN_irish_whisky,
//                FeedEntry.COLUMN_metaxa_brandy,
//                FeedEntry.COLUMN_white_rum,
//                FeedEntry.COLUMN_golden_rum,
//                FeedEntry.COLUMN_dark_rum,
//                FeedEntry.COLUMN_dry_gin_silver,
//                FeedEntry.COLUMN_tequila_blanco,
//                FeedEntry.COLUMN_tequila_reposado,
//                FeedEntry.COLUMN_sambuca,
//                FeedEntry.COLUMN_jagermeister,
//                FeedEntry.COLUMN_vermout_martini_dry,
//                FeedEntry.COLUMN_vermout_martini_rosso,
//                FeedEntry.COLUMN_vermout_martini_bianco,
//                FeedEntry.COLUMN_vermout_cinzano_dry,
//                FeedEntry.COLUMN_vermout_cinzano_rosso,
//                FeedEntry.COLUMN_vermout_cinzano_bianco,
//                FeedEntry.COLUMN_maraschino,
//                FeedEntry.COLUMN_banana_likier,
//                FeedEntry.COLUMN_triple_sec,
//                FeedEntry.COLUMN_amaretto_likier,
//                FeedEntry.COLUMN_peach_likier,
//                FeedEntry.COLUMN_blue_curacao_likier,
//                FeedEntry.COLUMN_dry_orange_curacao,
//                FeedEntry.COLUMN_peppermint_likier,
//                FeedEntry.COLUMN_coffee_likier,
//                FeedEntry.COLUMN_cocosowy_likier,
//                FeedEntry.COLUMN_irish_cream_liqueur,
//                FeedEntry.COLUMN_strawberry_liqueur,
//                FeedEntry.COLUMN_advocaat,
//                FeedEntry.COLUMN_malibu,
//                FeedEntry.COLUMN_sliwowica,
//                FeedEntry.COLUMN_angostura_bitters,
//                FeedEntry.COLUMN_orange_bitters,
//                FeedEntry.COLUMN_campari_bitter,
//                FeedEntry.COLUMN_mandarinetto,
//                FeedEntry.COLUMN_cydr,
//                FeedEntry.COLUMN_grenadine,
//                FeedEntry.COLUMN_syrop_malinowy,
//                FeedEntry.COLUMN_syrop_truskawkowy,
//                FeedEntry.COLUMN_syrop_wisniowy,
//                FeedEntry.COLUMN_syrop_cukrowy,
//                FeedEntry.COLUMN_sok_cytrynowy,
//                FeedEntry.COLUMN_sok_limonkowy,
//                FeedEntry.COLUMN_sok_pomaranczowy,
//                FeedEntry.COLUMN_sok_mandarynkowy,
//                FeedEntry.COLUMN_sok_grejpfrutowy,
//                FeedEntry.COLUMN_sok_annasowy,
//                FeedEntry.COLUMN_sok_jablkowy,
//                FeedEntry.COLUMN_sok_zurawinowy,
//                FeedEntry.COLUMN_sok_z_czerwonej_porzeczki,
//                FeedEntry.COLUMN_nektar_mango,
//                FeedEntry.COLUMN_sok_pomidorowy,
//                FeedEntry.COLUMN_coca_cola,
//                FeedEntry.COLUMN_seven_up,
//                FeedEntry.COLUMN_schweppes_bitter_lemon_soda,
//                FeedEntry.COLUMN_schweppes_bitter_orange_soda,
//                FeedEntry.COLUMN_schweppes_tonic_soda,
//                FeedEntry.COLUMN_slodka_smietanka,
//                FeedEntry.COLUMN_woda_sodowa,
//                FeedEntry.COLUMN_zimny_napar_kawy,
//                FeedEntry.COLUMN_goracy_napar_kawy,
//                FeedEntry.COLUMN_goracy_napar_herbaty,
//                FeedEntry.COLUMN_cukier_puder,
//                FeedEntry.COLUMN_cynamon,
//                FeedEntry.COLUMN_tabasco,
//                FeedEntry.COLUMN_sproszkowana_czekolada,
//                FeedEntry.COLUMN_zimne_mleko,
//                FeedEntry.COLUMN_bita_smietana,
//                FeedEntry.COLUMN_bialko_jajka,
//                FeedEntry.COLUMN_zoltko_jajka,
//                FeedEntry.COLUMN_inne,
//                FeedEntry.COLUMN_dekoracja,
//                FeedEntry.COLUMN_szklo,
//                FeedEntry.COLUMN_rodzaj,
//                FeedEntry.COLUMN_wykonanie,
//                FeedEntry.COLUMN_ocena,
//        };
//
//        String[] selection = {
//                FeedEntry.COLUMN_nazwa + " = ?",
//                FeedEntry.COLUMN_wodka + " = ?",
//                FeedEntry.COLUMN_scotch_whisky + " = ?",
//                FeedEntry.COLUMN_burbon_whisky + " = ?",
//                FeedEntry.COLUMN_american_blended_whiskey + " = ?",
//                FeedEntry.COLUMN_apple_brandy + " = ?",
//                FeedEntry.COLUMN_cherry_brandy + " = ?",
//                FeedEntry.COLUMN_irish_whisky + " = ?",
//                FeedEntry.COLUMN_metaxa_brandy + " = ?",
//                FeedEntry.COLUMN_white_rum + " = ?",
//                FeedEntry.COLUMN_golden_rum + " = ?",
//                FeedEntry.COLUMN_dark_rum + " = ?",
//                FeedEntry.COLUMN_dry_gin_silver + " = ?",
//                FeedEntry.COLUMN_tequila_blanco + " = ?",
//                FeedEntry.COLUMN_tequila_reposado + " = ?",
//                FeedEntry.COLUMN_sambuca + " = ?",
//                FeedEntry.COLUMN_jagermeister + " = ?",
//                FeedEntry.COLUMN_vermout_martini_dry + " = ?",
//                FeedEntry.COLUMN_vermout_martini_rosso + " = ?",
//                FeedEntry.COLUMN_vermout_martini_bianco + " = ?",
//                FeedEntry.COLUMN_vermout_cinzano_dry + " = ?",
//                FeedEntry.COLUMN_vermout_cinzano_rosso + " = ?",
//                FeedEntry.COLUMN_vermout_cinzano_bianco + " = ?",
//                FeedEntry.COLUMN_maraschino + " = ?",
//                FeedEntry.COLUMN_banana_likier + " = ?",
//                FeedEntry.COLUMN_triple_sec + " = ?",
//                FeedEntry.COLUMN_amaretto_likier + " = ?",
//                FeedEntry.COLUMN_peach_likier + " = ?",
//                FeedEntry.COLUMN_blue_curacao_likier + " = ?",
//                FeedEntry.COLUMN_dry_orange_curacao + " = ?",
//                FeedEntry.COLUMN_peppermint_likier + " = ?",
//                FeedEntry.COLUMN_coffee_likier + " = ?",
//                FeedEntry.COLUMN_cocosowy_likier + " = ?",
//                FeedEntry.COLUMN_irish_cream_liqueur + " = ?",
//                FeedEntry.COLUMN_strawberry_liqueur + " = ?",
//                FeedEntry.COLUMN_advocaat + " = ?",
//                FeedEntry.COLUMN_malibu + " = ?",
//                FeedEntry.COLUMN_sliwowica + " = ?",
//                FeedEntry.COLUMN_angostura_bitters + " = ?",
//                FeedEntry.COLUMN_orange_bitters + " = ?",
//                FeedEntry.COLUMN_campari_bitter + " = ?",
//                FeedEntry.COLUMN_mandarinetto + " = ?",
//                FeedEntry.COLUMN_cydr + " = ?",
//                FeedEntry.COLUMN_grenadine + " = ?",
//                FeedEntry.COLUMN_syrop_malinowy + " = ?",
//                FeedEntry.COLUMN_syrop_truskawkowy + " = ?",
//                FeedEntry.COLUMN_syrop_wisniowy + " = ?",
//                FeedEntry.COLUMN_syrop_cukrowy + " = ?",
//                FeedEntry.COLUMN_sok_cytrynowy + " = ?",
//                FeedEntry.COLUMN_sok_limonkowy + " = ?",
//                FeedEntry.COLUMN_sok_pomaranczowy + " = ?",
//                FeedEntry.COLUMN_sok_mandarynkowy + " = ?",
//                FeedEntry.COLUMN_sok_grejpfrutowy + " = ?",
//                FeedEntry.COLUMN_sok_annasowy + " = ?",
//                FeedEntry.COLUMN_sok_jablkowy + " = ?",
//                FeedEntry.COLUMN_sok_zurawinowy + " = ?",
//                FeedEntry.COLUMN_sok_z_czerwonej_porzeczki + " = ?",
//                FeedEntry.COLUMN_nektar_mango + " = ?",
//                FeedEntry.COLUMN_sok_pomidorowy + " = ?",
//                FeedEntry.COLUMN_coca_cola + " = ?",
//                FeedEntry.COLUMN_seven_up + " = ?",
//                FeedEntry.COLUMN_schweppes_bitter_lemon_soda + " = ?",
//                FeedEntry.COLUMN_schweppes_bitter_orange_soda + " = ?",
//                FeedEntry.COLUMN_schweppes_tonic_soda + " = ?",
//                FeedEntry.COLUMN_slodka_smietanka + " = ?",
//                FeedEntry.COLUMN_woda_sodowa + " = ?",
//                FeedEntry.COLUMN_zimny_napar_kawy + " = ?",
//                FeedEntry.COLUMN_goracy_napar_kawy + " = ?",
//                FeedEntry.COLUMN_goracy_napar_herbaty + " = ?",
//                FeedEntry.COLUMN_cukier_puder + " = ?",
//                FeedEntry.COLUMN_cynamon + " = ?",
//                FeedEntry.COLUMN_tabasco + " = ?",
//                FeedEntry.COLUMN_sproszkowana_czekolada + " = ?",
//                FeedEntry.COLUMN_zimne_mleko + " = ?",
//                FeedEntry.COLUMN_bita_smietana + " = ?",
//                FeedEntry.COLUMN_bialko_jajka + " = ?",
//                FeedEntry.COLUMN_zoltko_jajka + " = ?",
//                FeedEntry.COLUMN_inne + " = ?",
//                FeedEntry.COLUMN_dekoracja + " = ?",
//                FeedEntry.COLUMN_szklo + " = ?",
//                FeedEntry.COLUMN_rodzaj + " = ?",
//                FeedEntry.COLUMN_wykonanie + " = ?",
//                FeedEntry.COLUMN_ocena + " = ?"
//        };
//
//        String[] selectionArgs = {nazwa, wodka, scotch_whisky, burbon_whisky, american_blended_whiskey, apple_brandy, cherry_brandy, irish_whisky, metaxa_brandy,                       white_rum, golden_rum, dark_rum, dry_gin_silver, tequila_blanco, tequila_reposado, sambuca, jagermeister, vermout_martini_dry, vermout_martini_rosso,
//                        vermout_martini_bianco, vermout_cinzano_dry, vermout_cinzano_rosso, vermout_cinzano_bianco, maraschino, banana_likier,
//                        triple_sec, amaretto_likier, peach_likier, blue_curacao_likier, dry_orange_curacao, peppermint_likier, coffee_likier,
//                        cocosowy_likier, irish_cream_liqueur, strawberry_liqueur, advocaat, malibu, sliwowica, angostura_bitters, orange_bitters,
//                        campari_bitter, mandarinetto, cydr, grenadine, syrop_malinowy, syrop_truskawkowy, syrop_wisniowy, syrop_cukrowy,
//                        sok_cytrynowy, sok_limonkowy, sok_pomaranczowy, sok_mandarynkowy, sok_grejpfrutowy, sok_annasowy, sok_jablkowy,
//                        sok_zurawinowy, sok_z_czerwonej_porzeczki, nektar_mango, sok_pomidorowy, coca_cola, seven_up, schweppes_bitter_lemon_soda,
//                        schweppes_bitter_orange_soda, schweppes_tonic_soda, slodka_smietanka, woda_sodowa, zimny_napar_kawy, goracy_napar_kawy,
//                        goracy_napar_herbaty, cukier_puder, cynamon, tabasco, sproszkowana_czekolada, zimne_mleko, bita_smietana, bialko_jajka,
//                        zoltko_jajka, inne, dekoracja, szklo, rodzaj, wykonanie, ocena};
//
//
//        return db.query("Barek", columns, String.valueOf(selection), selectionArgs, null  , null , null, null);
//
//    }



    //    public Cursor readBy(String ) {
//
//        SQLiteDatabase db = getReadableDatabase();
//
//        // Define a projection that specifies which columns from the database
//        // you will actually use after this query.
//        String[] projection = {
//                BaseColumns._ID,
//                FeedEntry.COLUMN_LEVEL,
//                FeedEntry.COLUMN_FIGURES,
//                FeedEntry.COLUMN_
//        };
//
//        // Filter results WHERE "title" = 'My Title'
//        String selection = FeedEntry.COLUMN_ + " = ?";
//        String[] selectionArgs = {String.valueOf()};
//
//
//        return db.query(
//                "Plan",   // The table to query
//                projection,             // The array of columns to return (pass null to get all)
//                selection,              // The columns for the WHERE clause
//                selectionArgs,          // The values for the WHERE clause
//                null,                   // don't group the rows
//                null,                   // don't filter by row groups
//                null               // The sort order
//        );
//
//    }
//
//    public Cursor findFiguresID(String figures, String level) {
//
//        SQLiteDatabase db = getReadableDatabase();
//
//        // Define a projection that specifies which columns from the database
//        // you will actually use after this query.
//        String[] projection = {
//                BaseColumns._ID
//        };
//
//        // Filter results WHERE "title" = 'My Title'
//        String selection = FeedEntry.COLUMN_FIGURES + " = ?" + " AND " + FeedEntry.COLUMN_LEVEL + " = ?";
//        String[] selectionArgs = {String.valueOf(figures), String.valueOf(level)};
//
//
//        return db.query(
//                "Plan",   // The table to query
//                projection,             // The array of columns to return (pass null to get all)
//                selection,              // The columns for the WHERE clause
//                selectionArgs,          // The values for the WHERE clause
//                null,                   // don't group the rows
//                null,                   // don't filter by row groups
//                null               // The sort order
//        );
//
//    }
//
    public void deletaAllBase(){

        SQLiteDatabase db = getWritableDatabase();
        // Define 'where' part of query.
//        String selection = FeedEntry.COLUMN_LEVEL + " LIKE ?";
//        // Specify arguments in placeholder order.
//        String[] selectionArgs = { "P0" };
        // Issue SQL statement.
        db.delete("Barek", null  , null);


    }
}
