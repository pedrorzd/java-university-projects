import Carros.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Objetos da classe Gol
        Gol gol1 = new Gol("Volkswagen", "Gol G4", "Prata", "9BWZZZ377VT001", "ABC1A23", "2010", 18000.00);
        Gol gol2 = new Gol("Volkswagen", "Gol G5", "Preto", "9BWZZZ377VT002", "DEF2B34", "2012", 20000.00);
        Gol gol3 = new Gol("Volkswagen", "Gol G6", "Vermelho", "9BWZZZ377VT003", "GHI3C45", "2014", 23000.00);
        Gol gol4 = new Gol("Volkswagen", "Gol G7", "Branco", "9BWZZZ377VT004", "JKL4D56", "2016", 25000.00);
        Gol gol5 = new Gol("Volkswagen", "Gol Rallye", "Azul", "9BWZZZ377VT005", "MNO5E67", "2018", 27000.00);

        // Objetos da classe Palio
        Palio palio1 = new Palio("Fiat", "Palio Fire", "Cinza", "9BWZZZ377VT006", "PQR6F78", "2013", 19000.00);
        Palio palio2 = new Palio("Fiat", "Palio Attractive", "Preto", "9BWZZZ377VT007", "STU7G89", "2015", 21000.00);
        Palio palio3 = new Palio("Fiat", "Palio Essence", "Branco", "9BWZZZ377VT008", "VWX8H90", "2016", 23000.00);
        Palio palio4 = new Palio("Fiat", "Palio Sporting", "Vermelho", "9BWZZZ377VT009", "YZA9I01", "2017", 25000.00);
        Palio palio5 = new Palio("Fiat", "Palio Weekend", "Prata", "9BWZZZ377VT010", "BCD0J12", "2014", 22000.00);

        // Objetos da classe Uno
        Uno uno1 = new Uno("Fiat", "Uno Mille", "Branco", "9BWZZZ377VT011", "EFG1K23", "2011", 17000.00);
        Uno uno2 = new Uno("Fiat", "Uno Vivace", "Vermelho", "9BWZZZ377VT012", "HIJ2L34", "2012", 18000.00);
        Uno uno3 = new Uno("Fiat", "Uno Way", "Cinza", "9BWZZZ377VT013", "KLM3M45", "2013", 19000.00);
        Uno uno4 = new Uno("Fiat", "Uno Attractive", "Azul", "9BWZZZ377VT014", "NOP4N56", "2014", 20000.00);
        Uno uno5 = new Uno("Fiat", "Uno Sporting", "Preto", "9BWZZZ377VT015", "QRS5O67", "2015", 21000.00);

        // Objetos da classe Argo
        Argo argo1 = new Argo("Fiat", "Argo Drive", "Vermelho", "9BWZZZ377VT016", "TUV6P78", "2020", 52000.00);
        Argo argo2 = new Argo("Fiat", "Argo Trekking", "Cinza", "9BWZZZ377VT017", "WXY7Q89", "2021", 58000.00);
        Argo argo3 = new Argo("Fiat", "Argo Precision", "Prata", "9BWZZZ377VT018", "ZAB8R90", "2019", 49000.00);
        Argo argo4 = new Argo("Fiat", "Argo HGT", "Branco", "9BWZZZ377VT019", "CDE9S01", "2022", 60000.00);
        Argo argo5 = new Argo("Fiat", "Argo 1.0", "Preto", "9BWZZZ377VT020", "FGH0T12", "2018", 47000.00);

        // Objetos da classe Corolla
        Corolla corolla1 = new Corolla("Toyota", "Corolla GLi", "Prata", "9BWZZZ377VT021", "IJK1U23", "2018", 95000.00);
        Corolla corolla2 = new Corolla("Toyota", "Corolla XEi", "Preto", "9BWZZZ377VT022", "LMN2V34", "2019", 105000.00);
        Corolla corolla3 = new Corolla("Toyota", "Corolla Altis", "Branco", "9BWZZZ377VT023", "OPQ3W45", "2020", 115000.00);
        Corolla corolla4 = new Corolla("Toyota", "Corolla Cross", "Cinza", "9BWZZZ377VT024", "RST4X56", "2021", 125000.00);
        Corolla corolla5 = new Corolla("Toyota", "Corolla Hybrid", "Azul", "9BWZZZ377VT025", "UVW5Y67", "2022", 135000.00);

        // Objetos da classe X6
        X6 x61 = new X6("BMW", "X6 M", "Preto", "9BWZZZ377VT026", "XYZ6Z78", "2022", 450000.00);
        X6 x62 = new X6("BMW", "X6 xDrive40i", "Branco", "9BWZZZ377VT027", "ABC7A89", "2023", 470000.00);
        X6 x63 = new X6("BMW", "X6 xDrive30d", "Cinza", "9BWZZZ377VT028", "DEF8B90", "2021", 430000.00);
        X6 x64 = new X6("BMW", "X6 M Competition", "Vermelho", "9BWZZZ377VT029", "GHI9C01", "2024", 500000.00);
        X6 x65 = new X6("BMW", "X6 xLine", "Azul", "9BWZZZ377VT030", "JKL0D12", "2020", 410000.00);

        // Objetos da classe Toro
        Toro toro1 = new Toro("Fiat", "Toro Freedom", "Prata", "9BWZZZ377VT031", "MNO1E23", "2020", 125000.00);
        Toro toro2 = new Toro("Fiat", "Toro Ranch", "Vermelho", "9BWZZZ377VT032", "PQR2F34", "2023", 160000.00);
        Toro toro3 = new Toro("Fiat", "Toro Volcano", "Branco", "9BWZZZ377VT033", "STU3G45", "2022", 145000.00);
        Toro toro4 = new Toro("Fiat", "Toro Endurance", "Cinza", "9BWZZZ377VT034", "VWX4H56", "2021", 120000.00);
        Toro toro5 = new Toro("Fiat", "Toro Ultra", "Preto", "9BWZZZ377VT035", "YZA5I67", "2024", 170000.00);

        // Objetos da classe Saveiro
        Saveiro saveiro1 = new Saveiro("Volkswagen", "Saveiro Robust", "Branca", "9BWZZZ377VT036", "BCD6J78", "2019", 72000.00);
        Saveiro saveiro2 = new Saveiro("Volkswagen", "Saveiro Trendline", "Vermelho", "9BWZZZ377VT037", "EFG7K89", "2020", 75000.00);
        Saveiro saveiro3 = new Saveiro("Volkswagen", "Saveiro Cross", "Preto", "9BWZZZ377VT038", "HIJ8L90", "2021", 82000.00);
        Saveiro saveiro4 = new Saveiro("Volkswagen", "Saveiro CE", "Cinza", "9BWZZZ377VT039", "KLM9M01", "2018", 70000.00);
        Saveiro saveiro5 = new Saveiro("Volkswagen", "Saveiro Surf", "Prata", "9BWZZZ377VT040", "NOP0N12", "2017", 68000.00);


    }
}