/*
 Copyright (C) 2013 Choucri FAHED

 This source code is release under the BSD License.

 This file is part of QuantScale, a free-software/open-source library
 for financial quantitative analysts and developers - 
 http://github.com/choucrifahed/quantscale

 QuantScale is free software: you can redistribute it and/or modify it
 under the terms of the QuantScale license.  You should have received a
 copy of the license along with this program; if not, please email
 <choucri.fahed@mines-nancy.org>.

 This program is distributed in the hope that it will be useful, but WITHOUT
 ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 FOR A PARTICULAR PURPOSE.  See the license for more details.

 QuantScale is based on QuantLib. http://quantlib.org/
 When applicable, the original copyright notice follows this notice.
 */
/*
 Copyright (C) 2004, 2005, 2006 StatPro Italia srl

 This file is part of QuantLib, a free-software/open-source library
 for financial quantitative analysts and developers - http://quantlib.org/

 QuantLib is free software: you can redistribute it and/or modify it
 under the terms of the QuantLib license.  You should have received a
 copy of the license along with this program; if not, please email
 <quantlib-dev@lists.sf.net>. The license is also available online at
 <http://quantlib.org/license.shtml>.

 This program is distributed in the hope that it will be useful, but WITHOUT
 ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 FOR A PARTICULAR PURPOSE.  See the license for more details.
*/

package org.qslib.quantscale.currency

import org.qslib.quantscale.math._
import org.qslib.quantscale.Currency

/**
 * ==European Currencies==
 *
 * Object containing all European currencies.
 * Data from http://fx.sauder.ubc.ca/currency_table.html
 * and http://www.thefinancials.com/vortex/CurrencyFormats.html
 *
 * @author Choucri FAHED
 * @since 1.0
 */
object Europe {

  /**
    * ===Austrian shilling===
    * The ISO three-letter code was ATS; the numeric code was 40.
    * It was divided in 100 groschen.
    */
  lazy val ATS = Currency("Austrian shilling", "ATS", 40, "", "", 100,  Rounding(), "%2% %1$.2f",  Some(EUR))

  /**
    * ===Belgian franc===
    * The ISO three-letter code was BEF; the numeric code was 56.
       It had no subdivisions.
    */
  lazy val BEF = Currency("Belgian franc", "BEF", 56,"", "", 1,Rounding(),"%2% %1$.0f",Some(EUR))

  /**
    *  === Bulgarian lev===
    *  The ISO three-letter code is BGL; the numeric code is 100.
    *  It is divided in 100 stotinki.
    */
  lazy val BGL = Currency("Bulgarian lev", "BGL", 100, "lv", "", 100, Rounding(), "%1$.2f %3%")

  /**
    * ===Belarussian ruble===
    * The ISO three-letter code is BYR; the numeric code is 974.
    * It has no subdivisions.
    */
  lazy val BYR = Currency("Belarussian ruble", "BYR",974, "BR", "", 1, Rounding(), "%2% %1$.0f")


  /**
   * ==Swiss Franc==
   * The ISO three-letter code is CHF; the numeric code is 756.
   * It is divided into 100 cents.
   */
  lazy val CHF = Currency("Swiss franc", "CHF", 756, "SwF", "", 100, Rounding(), "%3% %1$.2f")

  /**
    * ===Cyprus pound===
    * The ISO three-letter code is CYP; the numeric code is 196.
    *   It is divided in 100 cents.
    */
  lazy val CYP = Currency("Cyprus pound", "CYP", 196,"\u00a3","C", 100,Rounding(),"%3% %1$.2f", Some(EUR))

  /**
    * ===Czech koruna===
    * The ISO three-letter code is CZK; the numeric code is 203.
    *   It is divided in 100 haleru.
    */
  lazy val CZK = Currency("Czech koruna", "CZK", 203,"Kc", "", 100,Rounding(),"%1$.2f %3%")

  /**
    * ===Deutsche mark===
    * The ISO three-letter code was DEM; the numeric code was 276.
       It was divided into 100 pfennig.
    */
  lazy val DEM = Currency("Deutsche mark", "DEM", 276,"DM", "", 100,Rounding(),"%1$.2f %3%",Some(EUR))

  /**
    * ===Danish krone===
    * The ISO three-letter code is DKK; the numeric code is 208.
    *   It is divided in 100 øre.
    */
  lazy val DKK = Currency("Danish krone", "DKK", 208,"Dkr", "", 100,Rounding(),"%3% %1$.2f")

  /**
    * ===Estonian kroon===
    * The ISO three-letter code is EEK; the numeric code is 233.
    *   It is divided in 100 senti.
    */
  lazy val EEK = Currency("Estonian kroon", "EEK", 233, "KR", "", 100, Rounding(),"%1$.2f %2%", Some(EUR))

  /**
    * ===Spanish peseta===
    * The ISO three-letter code was ESP; the numeric code was 724.
       It was divided in 100 centimos.
    */
  lazy val ESP = Currency( "Spanish peseta", "ESP", 724, "Pta", "", 100, Rounding(), "%1$.0f %3%", Some(EUR))

  /**
   * ==European Euro==
   * The ISO three-letter code is EUR; the numeric code is 978.
   * It is divided into 100 cents.
   */
  lazy val EUR = Currency("European Euro", "EUR", 978, "\u20ac", "", 100, Rounding(), "%2% %1$.2f")

  /**
    * ===Finnish markka===
    * The ISO three-letter code was FIM; the numeric code was 246.
    * It was divided in 100 penniä.
    */
  lazy val FIM = Currency("Finnish markka", "FIM", 246,  "mk", "", 100, Rounding(), "%1$.2f %3%", Some(EUR))

  /**
    * ===French franc===
    * The ISO three-letter code was FRF; the numeric code was 250.
    * It was divided in 100 centimes.
    */
  lazy val FRF = Currency("French franc", "FRF", 250,"", "", 100,Rounding(),"%1$.2f %2%",Some(EUR))


  /**
   * ==British Pound Sterling==
   * The ISO three-letter code is GBP; the numeric code is 826.
   * It is divided into 100 pence.
   */
  lazy val GBP = Currency("British pound sterling", "GBP", 826, "\u00a3", "p", 100, Rounding(), "%3% %1$.2f")

  /**
    * ===Greek drachma===
    * The ISO three-letter code was GRD; the numeric code was 300.
    * It was divided in 100 lepta.
    */
  lazy val GRD = Currency("Greek drachma", "GRD", 300,"", "", 100,Rounding(),"%1$.2f %2%",Some(EUR))


  /**
    * ===Hungarian forint===
    * The ISO three-letter code is HUF; the numeric code is 348.
    * It has no subdivisions.
    */
  lazy val HUF = Currency( "Hungarian forint", "HUF", 348, "Ft", "", 1, Rounding(), "%1$.0f %3%")

  /**
    * ===Irish punt===
    * The ISO three-letter code was IEP; the numeric code was 372.
    * It was divided in 100 pence.
    */
  lazy val IEP = Currency(  "Irish punt", "IEP", 372,  "", "", 100,  Rounding(),  "%2% %1$.2f",  Some(EUR))

  /**
    * ===Icelandic krona===
    * The ISO three-letter code is ISK; the numeric code is 352.
    *   It is divided in 100 aurar.
    */
  lazy val ISK = Currency("Iceland krona", "ISK", 352,"IKr", "", 100,Rounding(),"%1$.2f %3%")

  /**
    * ===Italian lira===
    * The ISO three-letter code was ITL; the numeric code was 380.
       It had no subdivisions.
    */
  lazy val ITL = Currency("Italian lira", "ITL", 380,"L", "", 1,Rounding(),"%3% %1$.0f",Some(EUR))

  /**
    * ===Lithuanian litas===
    * The ISO three-letter code is LTL; the numeric code is 440.
    * It is divided in 100 centu.
    */
  lazy val LTL = Currency("Lithuanian litas", "LTL", 440, "Lt", "", 100, Rounding(), "%1$.2f %3%", Some(EUR))


  /**
    * ===Luxembourg franc===
    * The ISO three-letter code was LUF; the numeric code was 442.
       It was divided in 100 centimes.
    */
  lazy val LUF = Currency("Luxembourg franc", "LUF", 442, "F", "", 100, Rounding(), "%1$.0f %3%", Some(EUR))

  /**
    * ===Latvian lat===
    * The ISO three-letter code is LVL; the numeric code is 428.
    *   It is divided in 100 santims.
    */
  lazy val LVL = Currency( "Latvian lat", "LVL", 428, "Ls", "", 100, Rounding(), "%3% %1$.2f", Some(EUR))


  /**
    * ===Maltese lira===
    * The ISO three-letter code is MTL; the numeric code is 470.
    *   It is divided in 100 cents.
    */
  lazy val MTL = Currency("Maltese lira", "MTL", 470,"Lm", "", 100,Rounding(),"%3% %1$.2f", Some(EUR))

  /**
    * ===Dutch guilder===
    * The ISO three-letter code was NLG; the numeric code was 528.
       It was divided in 100 cents.
    */
  lazy val NLG = Currency("Dutch guilder", "NLG", 528,"f", "", 100,Rounding(),"%3% %1$.2f",Some(EUR))

  /**
    * ===Norwegian krone===
    * The ISO three-letter code is NOK; the numeric code is 578.
    * It is divided in 100 øre.
    */
  lazy val NOK = Currency("Norwegian krone", "NOK", 578, "NKr", "", 100, Rounding(), "%3% %1$.2f")


  /**
    * ===Polish zloty===
    * The ISO three-letter code is PLN; the numeric code is 985.
    * It is divided in 100 groszy.
    */
  lazy val PLN = Currency("Polish zloty", "PLN", 985,"zl", "gr", 100,Rounding(),"%1$.2f %3%")

  /**
    * ===Portuguese escudo===
    * The ISO three-letter code was PTE; the numeric code was 620.
       It was divided in 100 centavos.
    */
  lazy val PTE = Currency("Portuguese escudo", "PTE", 620, "Esc", "", 100, Rounding(), "%1$.0f %3%", Some(EUR))

  /**
    * ===Romanian leu===
    * The ISO three-letter code was ROL; the numeric code was 642.
    * It was divided in 100 bani.
    */
  lazy val ROL = Currency("Romanian leu", "ROL", 642,"L", "", 100,Rounding(),"%1$.2f %3%", Some(RON))

  /**
    * ===Romanian new leu===
    * The ISO three-letter code is RON; the numeric code is 946.
    *   It is divided in 100 bani.
    */
  lazy val RON = Currency("Romanian new leu","RON", 946,"L", "", 100,Rounding(),"%1$.2f %3%")

  /**
    * ===Russian ruble===
    * The ISO three-letter code is RUB; the numeric code is 643.
    *   It is divided in 100 kopeyki.
    */
  lazy val RUB = Currency("Russian ruble","RUB", 643,"\u20BD", "", 100,Rounding(),"%1$.2f %2%")

  /**
   * ==Swedish krona==
   * The ISO three-letter code is SEK; the numeric code is 752.
   * It is divided in 100 oere.
   */
  lazy val SEK = Currency("Swedish krona", "SEK", 752, "kr", "", 100, Rounding(), "%1$.2f %3%")

  /**
    * ===Slovenian tolar===
    * The ISO three-letter code is SIT; the numeric code is 705.
    * It is divided in 100 stotinov.
    */
  lazy val SIT = Currency( "Slovenian tolar", "SIT", 705, "SlT", "", 100, Rounding(), "%1$.2f %3%", Some(EUR))

  /**
    * ===Slovak koruna===
    * The ISO three-letter code is SKK; the numeric code is 703.
    *  It is divided in 100 halierov.
    */
  lazy val SKK = Currency("Slovak koruna", "SKK", 703,"Sk", "", 100,Rounding(),"%1$.2f %3%", Some(EUR))

  /**
    * ===Turkish lira===
    * The ISO three-letter code was TRL; the numeric code was 792.
       It was divided in 100 kurus.
    */
  lazy val TRL = Currency("Turkish lira", "TRL", 792,"TL", "", 100,Rounding(),"%1$.0f %3%")

  /**
    * ===Ukrainian hryvnia===
    * The ISO three-letter code is UAH; the numeric code is 980.
    * It is divided in 100 kopiykas.
    */
  lazy val UAH = Currency("Ukrainian hryvnia", "UAH", 980,"hrn", "", 100,Rounding(),"%1$.2f %3%")


}
