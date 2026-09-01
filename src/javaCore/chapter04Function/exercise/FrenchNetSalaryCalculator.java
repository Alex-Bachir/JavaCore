package javaCore.chapter04Function.exercise;

import static javaCore.chapter02Condition.exercice.FrenchRevenueTaxeCalculator.applyRevenueTax;
import static javaCore.chapter02Condition.exercice.FrenchRevenueTaxeCalculator.applyTaxAllowance;
import static javaCore.chapter01Variable.exercice.SalaryForecast.applySocialCharges;
import static javaCore.chapter01Variable.exercice.SalaryForecast.calculateAnnualSalary;


public class FrenchNetSalaryCalculator {
    public static void main(String[] args) {

        // ça calcule le salaire annuel avec en argument l'horaire Brute
        // je récupère le résultat avec la variable annualBrut
        double annualBrut = calculateAnnualSalary(35);


        double salaireNet = applySocialCharges(annualBrut, 0.22);

        double salaireNetAfterAbattement = applyTaxAllowance(salaireNet, 0.10);

        double taxTotal = applyRevenueTax(salaireNetAfterAbattement);

        double salaireNetFinal = salaireNet - taxTotal;

        double salaireNetMensuel = salaireNetFinal / 12;

        System.out.println(annualBrut + " Salaire Annuel Brute");
        System.out.println(salaireNet + " Salaire Net après cotisation");
        System.out.println(salaireNetAfterAbattement + " Après abattement");
        System.out.println(taxTotal + " € impôt annuel");
        System.out.println(salaireNetFinal + " € net annuel après impôt");
        System.out.println(salaireNetMensuel + " € net mensuel après impôt");

    }
}
