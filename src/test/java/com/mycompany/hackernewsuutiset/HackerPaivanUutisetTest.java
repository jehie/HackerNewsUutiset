/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hackernewsuutiset;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;

/**
 *
 * @author Jesse
 */
public class HackerPaivanUutisetTest {

    private String top_stories = "[10725859,10725707,10724592,10725983,10725657,10725190,10724639,10723096,10723911,10722513,10725172,10723470,10724735,10722470,10723727,10725548,10718146,10722552,10722587,10725430,10725512,10718216,10724396,10724844,10718201,10718952,10723148,10724460,10724341,10722639,10717110,10724983,10709730,10717171,10723685,10724309,10711382,10722432,10720485,10718835,10717866,10720176,10721104,10717662,10722942,10718532,10720398,10721617,10723640,10723027,10722265,10721401,10725251,10725434,10723734,10725453,10722266,10721244,10725426,10725419,10717185,10720218,10718658,10718895,10719938,10722227,10725284,10724991,10722216,10720244,10717901,10721876,10718517,10720074,10717434,10719118,10725146,10721374,10724917,10719080,10719921,10725037,10720053,10717003,10718742,10717969,10724040,10718366,10717703,10717212,10718442,10724180,10722374,10717616,10717633,10720408,10715776,10716798,10722228,10717037,10717379,10721738,10716937,10715226,10717634,10715406,10710916,10721178,10711843,10723976,10715628,10721462,10721383,10719005,10723839,10723489,10715668,10712566,10722467,10710670,10709747,10716533,10722060,10718930,10722553,10719958,10717692,10724041,10717513,10709302,10722647,10723967,10723941,10720069,10722536,10722846,10723933,10723914,10723858,10723774,10722490,10723569,10718675,10716765,10720377,10709748,10722094,10723399,10723328,10716112,10719561,10722579,10715154,10722543,10719052,10714301,10722572,10722563,10722477,10724327,10715912,10722452,10724241,10722448,10722350,10717126,10722308,10722304,10715598,10722269,10710336,10716833,10724053,10712406,10718559,10721371,10712783,10718072,10719534,10721393,10722868,10723822,10715878,10717826,10717001,10720349,10712038,10712642,10711737,10721412,10717091,10721320,10723135,10718256,10717841,10721751,10712029,10715680,10722907,10712511,10723556,10723992,10720416,10712047,10717130,10715216,10713032,10713201,10718556,10717686,10714843,10722482,10714732,10720809,10715149,10711633,10714048,10714534,10712013,10721596,10718320,10714505,10720912,10715012,10716609,10714638,10713632,10716154,10710354,10716102,10711951,10712871,10716561,10715883,10712873,10719849,10712666,10713384,10714329,10710594,10708690,10712854,10714660,10721000,10716104,10714558,10715928,10716167,10711700,10723596,10714563,10719201,10715095,10717413,10723436,10723429,10718499,10713064,10709983,10712256,10712832,10711885,10711774,10720958,10716200,10721728,10713259,10710387,10721699,10718938,10712327,10713922,10712045,10722751,10712613,10713735,10710140,10716672,10713723,10721248,10712739,10721343,10708937,10719173,10721071,10717135,10722967,10718899,10720897,10720864,10712991,10714107,10713408,10714743,10722481,10713339,10714990,10712446,10712091,10712149,10721944,10715755,10720889,10710487,10716283,10721340,10717985,10708908,10715459,10717794,10709042,10719104,10709678,10720324,10717094,10710685,10710399,10708209,10710272,10715521,10709703,10715161,10721090,10716560,10721458,10722212,10715888,10713290,10711084,10712058,10710588,10711201,10712354,10709953,10710033,10720131,10709712,10722100,10719197,10712482,10722088,10722052,10710198,10710980,10720511,10720837,10708898,10721938,10710381,10713546,10719546,10713838,10717874,10714569,10709958,10712346,10720246,10714423,10710596,10712629,10710454,10712823,10711669,10712652,10721115,10721008,10720943,10713250,10720922,10711748,10711711,10717263,10715906,10717922,10717915,10709982,10709412,10719511,10715808,10719164,10719113,10713924,10719041,10711752,10708790,10718991,10710973,10713557,10713300,10718669,10708361,10718571,10708165,10708002,10711042,10710566,10711976,10711731,10712215,10715503,10713328,10708688,10710313,10714620,10717998,10709601,10714179,10713818,10713625,10708489,10708403,10714493,10714795,10714669,10714622,10714433,10715081,10709241,10708003,10708318,10711915,10711646,10724771,10708871,10708541,10708517,10710697,10708344,10710375,10715327,10717096,10709988,10709837,10708625,10708279,10708177,10710488,10711257,10708955,10709264,10722068,10712195,10724210,10723440,10722805,10722284,10721978,10721571,10720844,10719542,10718136,10725274,10719058,10725611]";
    private String new_stories = "[10726090,10726084,10726083,10726059,10726056,10726052,10726043,10726032,10726030,10726014,10726002,10725992,10725983,10725979,10725976,10725971,10725970,10725965,10725928,10725920,10725919,10725910,10725887,10725885,10725878,10725859,10725840,10725827,10725825,10725821,10725814,10725812,10725808,10725806,10725791,10725783,10725760,10725759,10725756,10725746,10725715,10725713,10725707,10725688,10725685,10725671,10725670,10725657,10725655,10725650,10725641,10725629,10725622,10725620,10725612,10725611,10725588,10725572,10725562,10725559,10725548,10725516,10725515,10725513,10725512,10725510,10725505,10725494,10725474,10725470,10725463,10725462,10725453,10725432,10725430,10725427,10725426,10725422,10725421,10725419,10725415,10725403,10725401,10725396,10725384,10725377,10725373,10725365,10725363,10725347,10725346,10725336,10725333,10725329,10725307,10725305,10725304,10725292,10725288,10725284,10725274,10725269,10725256,10725253,10725252,10725251,10725250,10725245,10725238,10725220,10725205,10725190,10725184,10725172,10725157,10725155,10725148,10725147,10725146,10725136,10725111,10725109,10725090,10725076,10725067,10725042,10725037,10725033,10725008,10725006,10724991,10724983,10724975,10724970,10724966,10724964,10724956,10724951,10724942,10724936,10724918,10724871,10724864,10724848,10724844,10724840,10724826,10724805,10724796,10724791,10724771,10724768,10724735,10724727,10724724,10724696,10724691,10724678,10724672,10724658,10724653,10724649,10724639,10724632,10724627,10724625,10724616,10724615,10724592,10724587,10724586,10724570,10724567,10724563,10724558,10724544,10724534,10724522,10724517,10724501,10724476,10724460,10724458,10724437,10724427,10724420,10724416,10724397,10724396,10724395,10724375,10724353,10724349,10724344,10724341,10724334,10724332,10724330,10724327,10724322,10724317,10724313,10724309,10724295,10724285,10724256,10724241,10724207,10724180,10724166,10724159,10724127,10724117,10724098,10724059,10724057,10724053,10724041,10724040,10724027,10723999,10723992,10723985,10723984,10723976,10723967,10723955,10723942,10723941,10723933,10723927,10723923,10723918,10723914,10723911,10723907,10723902,10723898,10723874,10723858,10723856,10723839,10723838,10723833,10723822,10723810,10723805,10723799,10723789,10723787,10723774,10723772,10723770,10723767,10723765,10723738,10723734,10723727,10723701,10723687,10723686,10723685,10723677,10723673,10723669,10723654,10723640,10723633,10723632,10723624,10723622,10723614,10723606,10723596,10723593,10723591,10723586,10723576,10723573,10723569,10723566,10723560,10723556,10723552,10723549,10723548,10723543,10723518,10723517,10723516,10723510,10723494,10723489,10723487,10723485,10723483,10723477,10723476,10723473,10723472,10723470,10723460,10723437,10723436,10723429,10723414,10723412,10723410,10723406,10723402,10723399,10723395,10723393,10723392,10723384,10723381,10723379,10723369,10723359,10723349,10723347,10723341,10723339,10723334,10723328,10723327,10723316,10723314,10723305,10723299,10723298,10723286,10723282,10723280,10723272,10723264,10723261,10723256,10723246,10723228,10723216,10723215,10723204,10723180,10723175,10723170,10723167,10723166,10723161,10723156,10723155,10723154,10723148,10723144,10723135,10723132,10723112,10723108,10723102,10723096,10723081,10723074,10723072,10723071,10723068,10723065,10723059,10723044,10723038,10723036,10723035,10723027,10723005,10722981,10722975,10722967,10722965,10722963,10722952,10722948,10722942,10722939,10722937,10722934,10722932,10722917,10722913,10722907,10722906,10722884,10722876,10722868,10722867,10722859,10722856,10722846,10722844,10722837,10722833,10722828,10722827,10722804,10722798,10722774,10722751,10722750,10722740,10722736,10722735,10722732,10722679,10722674,10722673,10722670,10722658,10722653,10722647,10722639,10722636,10722633,10722619,10722616,10722607,10722593,10722587,10722585,10722583,10722579,10722576,10722572,10722565,10722563,10722553,10722552,10722545,10722543,10722537,10722536,10722535,10722534,10722526,10722522,10722513,10722497,10722496,10722493,10722490,10722482,10722481,10722477,10722472,10722470,10722467,10722464,10722452,10722448,10722445,10722444,10722437,10722432,10722416,10722406,10722402,10722381,10722374,10722364,10722350,10722345,10722339,10722322,10722310,10722308,10722304,10722293,10722274,10722269,10722266,10722265,10722257,10722252,10722234,10722228,10722227,10722223,10722216,10722212,10722211,10722205,10722201,10722192,10722191,10722159,10722146,10722137,10722133,10722123,10722120,10722104,10722100,10722094]";
    private HackerPaivanUutiset hackerPaivanUutiset;

    @Rule
    public WireMockRule wireMockRule = new WireMockRule(18089);

    @Before
    public void init() {
        this.hackerPaivanUutiset = new HackerPaivanUutiset();

        stubFor(get(urlEqualTo("/v0/topstories.json")).willReturn(
                aResponse().withStatus(200).withHeader("Content-Type", "text/plain").withBody(top_stories)));
        stubFor(get(urlEqualTo("/v0/item/10725859.json?print=pretty")).willReturn(
                aResponse().withStatus(200).withHeader("Content-Type", "text/plain").withBody("{\n"
                        + "  \"by\" : \"pyb\",\n"
                        + "  \"descendants\" : 9,\n"
                        + "  \"id\" : 10725859,\n"
                        + "  \"kids\" : [ 10726088, 10726073, 10725964, 10725886 ],\n"
                        + "  \"score\" : 87,\n"
                        + "  \"time\" : 1449998356,\n"
                        + "  \"title\" : \"Files Are Hard\",\n"
                        + "  \"type\" : \"story\",\n"
                        + "  \"url\" : \"http://danluu.com/file-consistency/\"\n"
                        + "}")));

        stubFor(get(urlEqualTo("/v0/newstories.json")).willReturn(
                aResponse().withStatus(200).withHeader("Content-Type", "text/plain").withBody(new_stories)));
        stubFor(get(urlEqualTo("/v0/item/10726090.json?print=pretty")).willReturn(
                aResponse().withStatus(200).withHeader("Content-Type", "text/plain").withBody("{\n"
                        + "  \"by\" : \"thecuriousone\",\n"
                        + "  \"descendants\" : 0,\n"
                        + "  \"id\" : 10726090,\n"
                        + "  \"score\" : 1,\n"
                        + "  \"text\" : \"bonus: why are they successful to you?\",\n"
                        + "  \"time\" : 1450006555,\n"
                        + "  \"title\" : \"Ask HN: What successful blogs do you follow?\",\n"
                        + "  \"type\" : \"story\"\n"
                        + "}")));
    }

    @Test
    public void testHaeSuosituinUutinen() {

        hackerPaivanUutiset.setDefault_url("http://localhost:18089");
        String suosituin_uutinen = hackerPaivanUutiset.haeSuosituinUutinen();
        System.out.println(suosituin_uutinen);

        assertTrue(suosituin_uutinen.contains("Files Are Hard"));

    }

    @Test
    public void testHaeViimeisinUutinen() {
        hackerPaivanUutiset.setDefault_url("http://localhost:18089");
        String uusin_uutinen = hackerPaivanUutiset.haeViimeisinUutinen();
        
        assertTrue(uusin_uutinen.contains("Ask HN: What successful blogs do you follow?"));

    }

}