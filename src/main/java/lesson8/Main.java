package lesson8;


import com.tunyk.currencyconverter.BankUaCom;
import com.tunyk.currencyconverter.api.Currency;
import com.tunyk.currencyconverter.api.CurrencyConverter;
import com.tunyk.currencyconverter.api.CurrencyConverterException;


public class Main {
    public static void main(String[] args) throws CurrencyConverterException {

        CurrencyConverter currencyConverter = new BankUaCom(Currency.EUR, Currency.MDL);
        Float money = currencyConverter.convertCurrency(10f);

        System.out.println(money);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Дізнайся скільки в тебе гривен:");
//
//
//        System.out.println(scanner.nextDouble() * ueCurrency);


    }
}
