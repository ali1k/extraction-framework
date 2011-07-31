package org.dbpedia.extraction.config.dataparser


object ParserUtilsConfig
{

    val scalesMap = Map(
        "en" -> Map(
            "thousand" -> 3,
            "million" -> 6,
            "mio" -> 6,
            "mln" -> 6,
            "billion" -> 9,
            "bln" -> 9,
            "trillion" -> 12,
            "quadrillion" -> 15
        ),
        "de" -> Map(
            "tausend" -> 3,
            "million" -> 6,
            "mio" -> 6,
            "milliarde" -> 9,
            "mrd" -> 9,
            "billion" -> 12
        ),
        "pl" -> Map(
            "tysiąc" -> 3,
            "tysiące" -> 3,
            "tysięcy" -> 3,
            "tys" -> 3,
            "tyś" -> 3,
            "milion" -> 6,
            "miliony" -> 6,
            "milionów" -> 6,
            "mln" -> 6,
            "miliard" -> 9,
            "miliardy" -> 9,
            "miliardów" -> 9,
            "mld" -> 9,
            "bilion" -> 12,
            "biliony" -> 12,
            "bilionów" -> 12,
            "bln" -> 12
        )
    )

}