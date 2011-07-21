package corpusrefiner.rs;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import corpusrefiner.model.CorpusRefinerDocument;
import corpusrefiner.model.CorpusRefinerEntity;
import corpusrefiner.model.CorpusRefinerSentence;
import corpusrefiner.model.CorpusRefinerToken;

@Path("/docs")
@Component
@Scope("request")
public class DocumentService {

	private List<CorpusRefinerDocument> documents;

	public DocumentService() {
		this.documents = this.generateDummyDocuments();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public CorpusRefinerDocument getNextDoc() {
		return this.documents.get(0);
	}

	private List<CorpusRefinerDocument> generateDummyDocuments() {
		List<CorpusRefinerDocument> documents;
		List<CorpusRefinerSentence> sentences;
		List<CorpusRefinerToken> tokens;
		List<CorpusRefinerEntity> entities;
		List<Integer> entityTokens;
		documents = new ArrayList<CorpusRefinerDocument>();
		sentences = new ArrayList<CorpusRefinerSentence>();
		tokens = new ArrayList<CorpusRefinerToken>();
		tokens.add(new CorpusRefinerToken(0, 3));
		tokens.add(new CorpusRefinerToken(4, 9));
		tokens.add(new CorpusRefinerToken(10, 12));
		tokens.add(new CorpusRefinerToken(13, 18));
		tokens.add(new CorpusRefinerToken(19, 26));
		tokens.add(new CorpusRefinerToken(27, 33));
		tokens.add(new CorpusRefinerToken(34, 42));
		tokens.add(new CorpusRefinerToken(43, 46));
		tokens.add(new CorpusRefinerToken(47, 50));
		tokens.add(new CorpusRefinerToken(51, 60));
		tokens.add(new CorpusRefinerToken(61, 69));
		tokens.add(new CorpusRefinerToken(70, 72));
		tokens.add(new CorpusRefinerToken(73, 74));
		tokens.add(new CorpusRefinerToken(75, 87));
		tokens.add(new CorpusRefinerToken(88, 93));
		tokens.add(new CorpusRefinerToken(94, 105));
		tokens.add(new CorpusRefinerToken(106, 108));
		tokens.add(new CorpusRefinerToken(109, 116));
		tokens.add(new CorpusRefinerToken(117, 122));
		tokens.add(new CorpusRefinerToken(123, 132));
		tokens.add(new CorpusRefinerToken(133, 135));
		tokens.add(new CorpusRefinerToken(136, 143));
		tokens.add(new CorpusRefinerToken(143, 144));
		tokens.add(new CorpusRefinerToken(145, 150));
		tokens.add(new CorpusRefinerToken(151, 156));
		tokens.add(new CorpusRefinerToken(156, 157));
		entities = new ArrayList<CorpusRefinerEntity>();
		entityTokens = new ArrayList<Integer>();
		entityTokens.add(24); // Wales
		entities.add(new CorpusRefinerEntity("organization", entityTokens));
		sentences.add(new CorpusRefinerSentence(0, 157, "dummy-doc-001.txt-s-0-157", tokens, entities));
		tokens = new ArrayList<CorpusRefinerToken>();
		tokens.add(new CorpusRefinerToken(158, 161));
		tokens.add(new CorpusRefinerToken(162, 165));
		tokens.add(new CorpusRefinerToken(166, 169));
		tokens.add(new CorpusRefinerToken(170, 177));
		tokens.add(new CorpusRefinerToken(178, 180));
		tokens.add(new CorpusRefinerToken(181, 188));
		tokens.add(new CorpusRefinerToken(189, 194));
		tokens.add(new CorpusRefinerToken(195, 198));
		tokens.add(new CorpusRefinerToken(199, 202));
		tokens.add(new CorpusRefinerToken(203, 209));
		tokens.add(new CorpusRefinerToken(209, 210));
		entities = new ArrayList<CorpusRefinerEntity>();
		sentences.add(new CorpusRefinerSentence(158, 210, "dummy-doc-001.txt-s-158-210", tokens, entities));
		tokens = new ArrayList<CorpusRefinerToken>();
		tokens.add(new CorpusRefinerToken(211, 214));
		tokens.add(new CorpusRefinerToken(215, 226));
		tokens.add(new CorpusRefinerToken(227, 233));
		tokens.add(new CorpusRefinerToken(234, 244));
		tokens.add(new CorpusRefinerToken(245, 255));
		tokens.add(new CorpusRefinerToken(256, 262));
		tokens.add(new CorpusRefinerToken(263, 265));
		tokens.add(new CorpusRefinerToken(266, 268));
		tokens.add(new CorpusRefinerToken(269, 272));
		tokens.add(new CorpusRefinerToken(273, 280));
		tokens.add(new CorpusRefinerToken(281, 286));
		tokens.add(new CorpusRefinerToken(287, 289));
		tokens.add(new CorpusRefinerToken(290, 296));
		tokens.add(new CorpusRefinerToken(297, 300));
		tokens.add(new CorpusRefinerToken(301, 303));
		tokens.add(new CorpusRefinerToken(304, 307));
		tokens.add(new CorpusRefinerToken(308, 312));
		tokens.add(new CorpusRefinerToken(313, 317));
		tokens.add(new CorpusRefinerToken(317, 318));
		entities = new ArrayList<CorpusRefinerEntity>();
		entityTokens = new ArrayList<Integer>();
		entityTokens.add(0); // The
		entityTokens.add(1); // Independent
		entityTokens.add(2); // Police
		entityTokens.add(3); // Complaints
		entityTokens.add(4); // Commission
		entities.add(new CorpusRefinerEntity("organization", entityTokens));
		sentences.add(new CorpusRefinerSentence(211, 318, "dummy-doc-001.txt-s-211-318", tokens, entities));
		tokens = new ArrayList<CorpusRefinerToken>();
		tokens.add(new CorpusRefinerToken(320, 331));
		tokens.add(new CorpusRefinerToken(332, 342));
		tokens.add(new CorpusRefinerToken(343, 350));
		tokens.add(new CorpusRefinerToken(351, 356));
		tokens.add(new CorpusRefinerToken(357, 360));
		tokens.add(new CorpusRefinerToken(361, 369));
		tokens.add(new CorpusRefinerToken(370, 372));
		tokens.add(new CorpusRefinerToken(373, 376));
		tokens.add(new CorpusRefinerToken(377, 384));
		tokens.add(new CorpusRefinerToken(385, 389));
		tokens.add(new CorpusRefinerToken(390, 392));
		tokens.add(new CorpusRefinerToken(393, 397));
		tokens.add(new CorpusRefinerToken(397, 398));
		entities = new ArrayList<CorpusRefinerEntity>();
		sentences.add(new CorpusRefinerSentence(320, 398, "dummy-doc-001.txt-s-320-398", tokens, entities));
		tokens = new ArrayList<CorpusRefinerToken>();
		tokens.add(new CorpusRefinerToken(399, 402));
		tokens.add(new CorpusRefinerToken(403, 408));
		tokens.add(new CorpusRefinerToken(409, 414));
		tokens.add(new CorpusRefinerToken(414, 415));
		tokens.add(new CorpusRefinerToken(416, 419));
		tokens.add(new CorpusRefinerToken(420, 421));
		tokens.add(new CorpusRefinerToken(421, 428));
		tokens.add(new CorpusRefinerToken(429, 434));
		tokens.add(new CorpusRefinerToken(434, 435));
		tokens.add(new CorpusRefinerToken(436, 437));
		tokens.add(new CorpusRefinerToken(438, 445));
		tokens.add(new CorpusRefinerToken(446, 452));
		tokens.add(new CorpusRefinerToken(452, 453));
		tokens.add(new CorpusRefinerToken(454, 459));
		tokens.add(new CorpusRefinerToken(460, 469));
		tokens.add(new CorpusRefinerToken(470, 473));
		tokens.add(new CorpusRefinerToken(474, 478));
		tokens.add(new CorpusRefinerToken(479, 484));
		tokens.add(new CorpusRefinerToken(485, 486));
		tokens.add(new CorpusRefinerToken(487, 491));
		tokens.add(new CorpusRefinerToken(492, 501));
		tokens.add(new CorpusRefinerToken(502, 504));
		tokens.add(new CorpusRefinerToken(505, 508));
		tokens.add(new CorpusRefinerToken(509, 515));
		tokens.add(new CorpusRefinerToken(515, 516));
		entities = new ArrayList<CorpusRefinerEntity>();
		entityTokens = new ArrayList<Integer>();
		entityTokens.add(10); // Stephen
		entityTokens.add(11); // Miller
		entities.add(new CorpusRefinerEntity("person", entityTokens));
		entityTokens = new ArrayList<Integer>();
		entityTokens.add(16); // Tony
		entityTokens.add(17); // Paris
		entities.add(new CorpusRefinerEntity("person", entityTokens));
		entityTokens = new ArrayList<Integer>();
		entityTokens.add(17); // Paris
		entities.add(new CorpusRefinerEntity("location", entityTokens));
		sentences.add(new CorpusRefinerSentence(399, 516, "dummy-doc-001.txt-s-399-516", tokens, entities));
		tokens = new ArrayList<CorpusRefinerToken>();
		tokens.add(new CorpusRefinerToken(517, 521));
		tokens.add(new CorpusRefinerToken(522, 526));
		tokens.add(new CorpusRefinerToken(527, 534));
		tokens.add(new CorpusRefinerToken(535, 537));
		tokens.add(new CorpusRefinerToken(538, 544));
		tokens.add(new CorpusRefinerToken(545, 547));
		tokens.add(new CorpusRefinerToken(548, 552));
		tokens.add(new CorpusRefinerToken(552, 553));
		entities = new ArrayList<CorpusRefinerEntity>();
		sentences.add(new CorpusRefinerSentence(517, 553, "dummy-doc-001.txt-s-517-553", tokens, entities));
		tokens = new ArrayList<CorpusRefinerToken>();
		tokens.add(new CorpusRefinerToken(554, 561));
		tokens.add(new CorpusRefinerToken(562, 568));
		tokens.add(new CorpusRefinerToken(569, 572));
		tokens.add(new CorpusRefinerToken(573, 577));
		tokens.add(new CorpusRefinerToken(578, 583));
		tokens.add(new CorpusRefinerToken(584, 588));
		tokens.add(new CorpusRefinerToken(589, 594));
		tokens.add(new CorpusRefinerToken(595, 604));
		tokens.add(new CorpusRefinerToken(605, 608));
		tokens.add(new CorpusRefinerToken(609, 614));
		tokens.add(new CorpusRefinerToken(614, 615));
		tokens.add(new CorpusRefinerToken(616, 619));
		tokens.add(new CorpusRefinerToken(620, 627));
		tokens.add(new CorpusRefinerToken(627, 628));
		entities = new ArrayList<CorpusRefinerEntity>();
		entityTokens = new ArrayList<Integer>();
		entityTokens.add(3); // John
		entityTokens.add(4); // Actie
		entities.add(new CorpusRefinerEntity("person", entityTokens));
		entityTokens = new ArrayList<Integer>();
		entityTokens.add(0); // Cousins
		entityTokens.add(1); // Ronnie
		entities.add(new CorpusRefinerEntity("organization", entityTokens));
		sentences.add(new CorpusRefinerSentence(554, 628, "dummy-doc-001.txt-s-554-628", tokens, entities));
		tokens = new ArrayList<CorpusRefinerToken>();
		tokens.add(new CorpusRefinerToken(630, 632));
		tokens.add(new CorpusRefinerToken(633, 637));
		tokens.add(new CorpusRefinerToken(638, 641));
		tokens.add(new CorpusRefinerToken(642, 646));
		tokens.add(new CorpusRefinerToken(647, 653));
		tokens.add(new CorpusRefinerToken(653, 654));
		tokens.add(new CorpusRefinerToken(655, 662));
		tokens.add(new CorpusRefinerToken(663, 669));
		tokens.add(new CorpusRefinerToken(669, 670));
		tokens.add(new CorpusRefinerToken(671, 679));
		tokens.add(new CorpusRefinerToken(680, 683));
		tokens.add(new CorpusRefinerToken(684, 689));
		tokens.add(new CorpusRefinerToken(690, 693));
		tokens.add(new CorpusRefinerToken(694, 697));
		tokens.add(new CorpusRefinerToken(698, 707));
		tokens.add(new CorpusRefinerToken(708, 710));
		tokens.add(new CorpusRefinerToken(711, 715));
		tokens.add(new CorpusRefinerToken(716, 718));
		tokens.add(new CorpusRefinerToken(719, 725));
		tokens.add(new CorpusRefinerToken(725, 726));
		entities = new ArrayList<CorpusRefinerEntity>();
		entityTokens = new ArrayList<Integer>();
		entityTokens.add(6); // Jeffrey
		entityTokens.add(7); // Gafoor
		entities.add(new CorpusRefinerEntity("person", entityTokens));
		sentences.add(new CorpusRefinerSentence(630, 726, "dummy-doc-001.txt-s-630-726", tokens, entities));
		tokens = new ArrayList<CorpusRefinerToken>();
		tokens.add(new CorpusRefinerToken(727, 733));
		tokens.add(new CorpusRefinerToken(733, 734));
		tokens.add(new CorpusRefinerToken(735, 736));
		tokens.add(new CorpusRefinerToken(737, 743));
		tokens.add(new CorpusRefinerToken(744, 746));
		tokens.add(new CorpusRefinerToken(747, 752));
		tokens.add(new CorpusRefinerToken(752, 754));
		tokens.add(new CorpusRefinerToken(754, 755));
		tokens.add(new CorpusRefinerToken(756, 763));
		tokens.add(new CorpusRefinerToken(764, 767));
		tokens.add(new CorpusRefinerToken(768, 772));
		tokens.add(new CorpusRefinerToken(773, 777));
		tokens.add(new CorpusRefinerToken(778, 780));
		tokens.add(new CorpusRefinerToken(781, 786));
		tokens.add(new CorpusRefinerToken(786, 787));
		entities = new ArrayList<CorpusRefinerEntity>();
		sentences.add(new CorpusRefinerSentence(727, 787, "dummy-doc-001.txt-s-727-787", tokens, entities));
		tokens = new ArrayList<CorpusRefinerToken>();
		tokens.add(new CorpusRefinerToken(789, 792));
		tokens.add(new CorpusRefinerToken(793, 798));
		tokens.add(new CorpusRefinerToken(799, 808));
		tokens.add(new CorpusRefinerToken(809, 816));
		tokens.add(new CorpusRefinerToken(817, 821));
		tokens.add(new CorpusRefinerToken(822, 825));
		tokens.add(new CorpusRefinerToken(826, 837));
		tokens.add(new CorpusRefinerToken(838, 845));
		tokens.add(new CorpusRefinerToken(846, 850));
		tokens.add(new CorpusRefinerToken(850, 851));
		entities = new ArrayList<CorpusRefinerEntity>();
		sentences.add(new CorpusRefinerSentence(789, 851, "dummy-doc-001.txt-s-789-851", tokens, entities));
		tokens = new ArrayList<CorpusRefinerToken>();
		tokens.add(new CorpusRefinerToken(852, 855));
		tokens.add(new CorpusRefinerToken(856, 861));
		tokens.add(new CorpusRefinerToken(862, 871));
		tokens.add(new CorpusRefinerToken(872, 875));
		tokens.add(new CorpusRefinerToken(876, 883));
		tokens.add(new CorpusRefinerToken(884, 886));
		tokens.add(new CorpusRefinerToken(887, 888));
		tokens.add(new CorpusRefinerToken(889, 894));
		tokens.add(new CorpusRefinerToken(895, 905));
		tokens.add(new CorpusRefinerToken(906, 908));
		tokens.add(new CorpusRefinerToken(909, 916));
		tokens.add(new CorpusRefinerToken(917, 920));
		tokens.add(new CorpusRefinerToken(921, 927));
		tokens.add(new CorpusRefinerToken(928, 930));
		tokens.add(new CorpusRefinerToken(931, 938));
		tokens.add(new CorpusRefinerToken(939, 941));
		tokens.add(new CorpusRefinerToken(942, 943));
		tokens.add(new CorpusRefinerToken(944, 948));
		tokens.add(new CorpusRefinerToken(949, 951));
		tokens.add(new CorpusRefinerToken(952, 958));
		tokens.add(new CorpusRefinerToken(958, 959));
		tokens.add(new CorpusRefinerToken(960, 970));
		tokens.add(new CorpusRefinerToken(970, 971));
		tokens.add(new CorpusRefinerToken(972, 981));
		tokens.add(new CorpusRefinerToken(982, 985));
		tokens.add(new CorpusRefinerToken(986, 995));
		tokens.add(new CorpusRefinerToken(996, 1004));
		tokens.add(new CorpusRefinerToken(1004, 1005));
		tokens.add(new CorpusRefinerToken(1005, 1006));
		entities = new ArrayList<CorpusRefinerEntity>();
		sentences.add(new CorpusRefinerSentence(852, 1006, "dummy-doc-001.txt-s-852-1006", tokens, entities));
		tokens = new ArrayList<CorpusRefinerToken>();
		tokens.add(new CorpusRefinerToken(1008, 1015));
		tokens.add(new CorpusRefinerToken(1016, 1021));
		tokens.add(new CorpusRefinerToken(1022, 1025));
		tokens.add(new CorpusRefinerToken(1026, 1031));
		tokens.add(new CorpusRefinerToken(1032, 1038));
		tokens.add(new CorpusRefinerToken(1039, 1047));
		tokens.add(new CorpusRefinerToken(1048, 1049));
		tokens.add(new CorpusRefinerToken(1050, 1055));
		tokens.add(new CorpusRefinerToken(1056, 1070));
		tokens.add(new CorpusRefinerToken(1071, 1077));
		tokens.add(new CorpusRefinerToken(1078, 1082));
		tokens.add(new CorpusRefinerToken(1082, 1083));
		tokens.add(new CorpusRefinerToken(1084, 1089));
		tokens.add(new CorpusRefinerToken(1090, 1099));
		tokens.add(new CorpusRefinerToken(1100, 1106));
		tokens.add(new CorpusRefinerToken(1107, 1115));
		tokens.add(new CorpusRefinerToken(1116, 1119));
		tokens.add(new CorpusRefinerToken(1120, 1125));
		tokens.add(new CorpusRefinerToken(1126, 1135));
		tokens.add(new CorpusRefinerToken(1136, 1143));
		tokens.add(new CorpusRefinerToken(1144, 1150));
		tokens.add(new CorpusRefinerToken(1150, 1151));
		entities = new ArrayList<CorpusRefinerEntity>();
		entityTokens = new ArrayList<Integer>();
		entityTokens.add(9); // Thomas
		entityTokens.add(10); // Page
		entities.add(new CorpusRefinerEntity("person", entityTokens));
		entityTokens = new ArrayList<Integer>();
		entityTokens.add(14); // Graham
		entityTokens.add(15); // Mouncher
		entities.add(new CorpusRefinerEntity("person", entityTokens));
		entityTokens = new ArrayList<Integer>();
		entityTokens.add(19); // Richard
		entityTokens.add(20); // Powell
		entities.add(new CorpusRefinerEntity("person", entityTokens));
		sentences.add(new CorpusRefinerSentence(1008, 1151, "dummy-doc-001.txt-s-1008-1151", tokens, entities));
		tokens = new ArrayList<CorpusRefinerToken>();
		tokens.add(new CorpusRefinerToken(1152, 1160));
		tokens.add(new CorpusRefinerToken(1161, 1165));
		tokens.add(new CorpusRefinerToken(1166, 1171));
		tokens.add(new CorpusRefinerToken(1172, 1175));
		tokens.add(new CorpusRefinerToken(1176, 1183));
		tokens.add(new CorpusRefinerToken(1184, 1186));
		tokens.add(new CorpusRefinerToken(1187, 1194));
		tokens.add(new CorpusRefinerToken(1195, 1196));
		tokens.add(new CorpusRefinerToken(1197, 1200));
		tokens.add(new CorpusRefinerToken(1201, 1208));
		tokens.add(new CorpusRefinerToken(1209, 1211));
		tokens.add(new CorpusRefinerToken(1212, 1217));
		tokens.add(new CorpusRefinerToken(1218, 1223));
		tokens.add(new CorpusRefinerToken(1224, 1228));
		tokens.add(new CorpusRefinerToken(1229, 1231));
		tokens.add(new CorpusRefinerToken(1232, 1237));
		tokens.add(new CorpusRefinerToken(1237, 1238));
		entities = new ArrayList<CorpusRefinerEntity>();
		entityTokens = new ArrayList<Integer>();
		entityTokens.add(0); // Mouncher
		entities.add(new CorpusRefinerEntity("person", entityTokens));
		sentences.add(new CorpusRefinerSentence(1152, 1238, "dummy-doc-001.txt-s-1152-1238", tokens, entities));
		tokens = new ArrayList<CorpusRefinerToken>();
		tokens.add(new CorpusRefinerToken(1239, 1242));
		tokens.add(new CorpusRefinerToken(1243, 1249));
		tokens.add(new CorpusRefinerToken(1250, 1258));
		tokens.add(new CorpusRefinerToken(1259, 1266));
		tokens.add(new CorpusRefinerToken(1267, 1269));
		tokens.add(new CorpusRefinerToken(1270, 1273));
		tokens.add(new CorpusRefinerToken(1274, 1284));
		tokens.add(new CorpusRefinerToken(1285, 1288));
		tokens.add(new CorpusRefinerToken(1289, 1296));
		tokens.add(new CorpusRefinerToken(1297, 1304));
		tokens.add(new CorpusRefinerToken(1304, 1305));
		tokens.add(new CorpusRefinerToken(1306, 1310));
		tokens.add(new CorpusRefinerToken(1311, 1319));
		tokens.add(new CorpusRefinerToken(1319, 1320));
		tokens.add(new CorpusRefinerToken(1321, 1325));
		tokens.add(new CorpusRefinerToken(1326, 1333));
		tokens.add(new CorpusRefinerToken(1333, 1334));
		tokens.add(new CorpusRefinerToken(1335, 1340));
		tokens.add(new CorpusRefinerToken(1341, 1350));
		tokens.add(new CorpusRefinerToken(1350, 1351));
		tokens.add(new CorpusRefinerToken(1352, 1355));
		tokens.add(new CorpusRefinerToken(1356, 1360));
		tokens.add(new CorpusRefinerToken(1361, 1368));
		tokens.add(new CorpusRefinerToken(1368, 1369));
		entities = new ArrayList<CorpusRefinerEntity>();
		entityTokens = new ArrayList<Integer>();
		entityTokens.add(8); // Michael
		entityTokens.add(9); // Daniels
		entities.add(new CorpusRefinerEntity("person", entityTokens));
		entityTokens = new ArrayList<Integer>();
		entityTokens.add(11); // Paul
		entityTokens.add(12); // Jennings
		entities.add(new CorpusRefinerEntity("person", entityTokens));
		entityTokens = new ArrayList<Integer>();
		entityTokens.add(14); // Paul
		entityTokens.add(15); // Stephen
		entities.add(new CorpusRefinerEntity("person", entityTokens));
		entityTokens = new ArrayList<Integer>();
		entityTokens.add(17); // Peter
		entityTokens.add(18); // Greenwood
		entities.add(new CorpusRefinerEntity("person", entityTokens));
		entityTokens = new ArrayList<Integer>();
		entityTokens.add(21); // John
		entityTokens.add(22); // Seaford
		entities.add(new CorpusRefinerEntity("person", entityTokens));
		sentences.add(new CorpusRefinerSentence(1239, 1369, "dummy-doc-001.txt-s-1239-1369", tokens, entities));
		tokens = new ArrayList<CorpusRefinerToken>();
		tokens.add(new CorpusRefinerToken(1371, 1380));
		tokens.add(new CorpusRefinerToken(1381, 1389));
		tokens.add(new CorpusRefinerToken(1389, 1390));
		tokens.add(new CorpusRefinerToken(1391, 1399));
		tokens.add(new CorpusRefinerToken(1400, 1405));
		tokens.add(new CorpusRefinerToken(1406, 1415));
		tokens.add(new CorpusRefinerToken(1416, 1422));
		tokens.add(new CorpusRefinerToken(1423, 1430));
		tokens.add(new CorpusRefinerToken(1431, 1434));
		tokens.add(new CorpusRefinerToken(1435, 1438));
		tokens.add(new CorpusRefinerToken(1439, 1445));
		tokens.add(new CorpusRefinerToken(1446, 1450));
		tokens.add(new CorpusRefinerToken(1451, 1455));
		tokens.add(new CorpusRefinerToken(1456, 1459));
		tokens.add(new CorpusRefinerToken(1460, 1466));
		tokens.add(new CorpusRefinerToken(1467, 1469));
		tokens.add(new CorpusRefinerToken(1470, 1477));
		tokens.add(new CorpusRefinerToken(1478, 1482));
		tokens.add(new CorpusRefinerToken(1482, 1483));
		entities = new ArrayList<CorpusRefinerEntity>();
		entityTokens = new ArrayList<Integer>();
		entityTokens.add(9); // Ian
		entityTokens.add(10); // Massey
		entities.add(new CorpusRefinerEntity("person", entityTokens));
		sentences.add(new CorpusRefinerSentence(1371, 1483, "dummy-doc-001.txt-s-1371-1483", tokens, entities));
		tokens = new ArrayList<CorpusRefinerToken>();
		tokens.add(new CorpusRefinerToken(1484, 1488));
		tokens.add(new CorpusRefinerToken(1489, 1493));
		tokens.add(new CorpusRefinerToken(1494, 1503));
		tokens.add(new CorpusRefinerToken(1504, 1511));
		tokens.add(new CorpusRefinerToken(1512, 1515));
		tokens.add(new CorpusRefinerToken(1516, 1519));
		tokens.add(new CorpusRefinerToken(1520, 1526));
		tokens.add(new CorpusRefinerToken(1526, 1527));
		entities = new ArrayList<CorpusRefinerEntity>();
		sentences.add(new CorpusRefinerSentence(1484, 1527, "dummy-doc-001.txt-s-1484-1527", tokens, entities));
		tokens = new ArrayList<CorpusRefinerToken>();
		tokens.add(new CorpusRefinerToken(1528, 1535));
		tokens.add(new CorpusRefinerToken(1536, 1538));
		tokens.add(new CorpusRefinerToken(1539, 1543));
		tokens.add(new CorpusRefinerToken(1544, 1546));
		tokens.add(new CorpusRefinerToken(1547, 1551));
		tokens.add(new CorpusRefinerToken(1552, 1556));
		tokens.add(new CorpusRefinerToken(1557, 1559));
		tokens.add(new CorpusRefinerToken(1560, 1566));
		tokens.add(new CorpusRefinerToken(1567, 1570));
		tokens.add(new CorpusRefinerToken(1571, 1574));
		tokens.add(new CorpusRefinerToken(1575, 1581));
		tokens.add(new CorpusRefinerToken(1582, 1591));
		tokens.add(new CorpusRefinerToken(1592, 1597));
		tokens.add(new CorpusRefinerToken(1598, 1600));
		tokens.add(new CorpusRefinerToken(1601, 1604));
		tokens.add(new CorpusRefinerToken(1605, 1610));
		tokens.add(new CorpusRefinerToken(1611, 1616));
		tokens.add(new CorpusRefinerToken(1616, 1617));
		tokens.add(new CorpusRefinerToken(1618, 1624));
		tokens.add(new CorpusRefinerToken(1624, 1626));
		tokens.add(new CorpusRefinerToken(1627, 1634));
		tokens.add(new CorpusRefinerToken(1635, 1641));
		tokens.add(new CorpusRefinerToken(1642, 1644));
		tokens.add(new CorpusRefinerToken(1645, 1648));
		tokens.add(new CorpusRefinerToken(1649, 1657));
		tokens.add(new CorpusRefinerToken(1658, 1663));
		tokens.add(new CorpusRefinerToken(1664, 1667));
		tokens.add(new CorpusRefinerToken(1668, 1677));
		tokens.add(new CorpusRefinerToken(1677, 1678));
		entities = new ArrayList<CorpusRefinerEntity>();
		entityTokens = new ArrayList<Integer>();
		entityTokens.add(25); // Paris
		entities.add(new CorpusRefinerEntity("location", entityTokens));
		sentences.add(new CorpusRefinerSentence(1528, 1678, "dummy-doc-001.txt-s-1528-1678", tokens, entities));
		tokens = new ArrayList<CorpusRefinerToken>();
		tokens.add(new CorpusRefinerToken(1680, 1683));
		tokens.add(new CorpusRefinerToken(1684, 1687));
		tokens.add(new CorpusRefinerToken(1688, 1698));
		tokens.add(new CorpusRefinerToken(1699, 1702));
		tokens.add(new CorpusRefinerToken(1703, 1708));
		tokens.add(new CorpusRefinerToken(1709, 1714));
		tokens.add(new CorpusRefinerToken(1715, 1721));
		tokens.add(new CorpusRefinerToken(1722, 1724));
		tokens.add(new CorpusRefinerToken(1725, 1732));
		tokens.add(new CorpusRefinerToken(1733, 1740));
		tokens.add(new CorpusRefinerToken(1740, 1741));
		tokens.add(new CorpusRefinerToken(1742, 1745));
		tokens.add(new CorpusRefinerToken(1746, 1750));
		tokens.add(new CorpusRefinerToken(1751, 1755));
		tokens.add(new CorpusRefinerToken(1756, 1763));
		tokens.add(new CorpusRefinerToken(1764, 1765));
		tokens.add(new CorpusRefinerToken(1766, 1772));
		tokens.add(new CorpusRefinerToken(1773, 1778));
		tokens.add(new CorpusRefinerToken(1779, 1783));
		tokens.add(new CorpusRefinerToken(1784, 1788));
		tokens.add(new CorpusRefinerToken(1789, 1791));
		tokens.add(new CorpusRefinerToken(1792, 1797));
		tokens.add(new CorpusRefinerToken(1798, 1802));
		tokens.add(new CorpusRefinerToken(1803, 1807));
		tokens.add(new CorpusRefinerToken(1808, 1814));
		tokens.add(new CorpusRefinerToken(1815, 1823));
		tokens.add(new CorpusRefinerToken(1824, 1828));
		tokens.add(new CorpusRefinerToken(1829, 1836));
		tokens.add(new CorpusRefinerToken(1837, 1844));
		tokens.add(new CorpusRefinerToken(1844, 1845));
		entities = new ArrayList<CorpusRefinerEntity>();
		entityTokens = new ArrayList<Integer>();
		entityTokens.add(9); // Sweeney
		entities.add(new CorpusRefinerEntity("person", entityTokens));
		sentences.add(new CorpusRefinerSentence(1680, 1845, "dummy-doc-001.txt-s-1680-1845", tokens, entities));
		tokens = new ArrayList<CorpusRefinerToken>();
		tokens.add(new CorpusRefinerToken(1846, 1849));
		tokens.add(new CorpusRefinerToken(1850, 1855));
		tokens.add(new CorpusRefinerToken(1856, 1860));
		tokens.add(new CorpusRefinerToken(1861, 1864));
		tokens.add(new CorpusRefinerToken(1865, 1870));
		tokens.add(new CorpusRefinerToken(1871, 1879));
		tokens.add(new CorpusRefinerToken(1880, 1887));
		tokens.add(new CorpusRefinerToken(1888, 1890));
		tokens.add(new CorpusRefinerToken(1891, 1905));
		tokens.add(new CorpusRefinerToken(1905, 1906));
		entities = new ArrayList<CorpusRefinerEntity>();
		sentences.add(new CorpusRefinerSentence(1846, 1906, "dummy-doc-001.txt-s-1846-1906", tokens, entities));
		tokens = new ArrayList<CorpusRefinerToken>();
		tokens.add(new CorpusRefinerToken(1908, 1909));
		tokens.add(new CorpusRefinerToken(1910, 1914));
		tokens.add(new CorpusRefinerToken(1915, 1918));
		tokens.add(new CorpusRefinerToken(1919, 1924));
		tokens.add(new CorpusRefinerToken(1925, 1927));
		tokens.add(new CorpusRefinerToken(1928, 1930));
		tokens.add(new CorpusRefinerToken(1931, 1938));
		tokens.add(new CorpusRefinerToken(1939, 1944));
		tokens.add(new CorpusRefinerToken(1945, 1950));
		tokens.add(new CorpusRefinerToken(1951, 1960));
		tokens.add(new CorpusRefinerToken(1960, 1961));
		tokens.add(new CorpusRefinerToken(1962, 1967));
		tokens.add(new CorpusRefinerToken(1968, 1972));
		tokens.add(new CorpusRefinerToken(1973, 1974));
		tokens.add(new CorpusRefinerToken(1975, 1980));
		tokens.add(new CorpusRefinerToken(1981, 1983));
		tokens.add(new CorpusRefinerToken(1984, 1987));
		tokens.add(new CorpusRefinerToken(1988, 1997));
		tokens.add(new CorpusRefinerToken(1998, 2004));
		tokens.add(new CorpusRefinerToken(2004, 2005));
		entities = new ArrayList<CorpusRefinerEntity>();
		sentences.add(new CorpusRefinerSentence(1908, 2005, "dummy-doc-001.txt-s-1908-2005", tokens, entities));
		tokens = new ArrayList<CorpusRefinerToken>();
		tokens.add(new CorpusRefinerToken(2006, 2009));
		tokens.add(new CorpusRefinerToken(2010, 2015));
		tokens.add(new CorpusRefinerToken(2016, 2022));
		tokens.add(new CorpusRefinerToken(2023, 2027));
		tokens.add(new CorpusRefinerToken(2028, 2030));
		tokens.add(new CorpusRefinerToken(2031, 2035));
		tokens.add(new CorpusRefinerToken(2036, 2038));
		tokens.add(new CorpusRefinerToken(2039, 2043));
		tokens.add(new CorpusRefinerToken(2044, 2046));
		tokens.add(new CorpusRefinerToken(2047, 2059));
		tokens.add(new CorpusRefinerToken(2060, 2062));
		tokens.add(new CorpusRefinerToken(2063, 2071));
		tokens.add(new CorpusRefinerToken(2072, 2081));
		tokens.add(new CorpusRefinerToken(2082, 2084));
		tokens.add(new CorpusRefinerToken(2085, 2088));
		tokens.add(new CorpusRefinerToken(2089, 2091));
		tokens.add(new CorpusRefinerToken(2092, 2095));
		tokens.add(new CorpusRefinerToken(2096, 2102));
		tokens.add(new CorpusRefinerToken(2102, 2103));
		tokens.add(new CorpusRefinerToken(2104, 2107));
		tokens.add(new CorpusRefinerToken(2108, 2115));
		tokens.add(new CorpusRefinerToken(2116, 2120));
		tokens.add(new CorpusRefinerToken(2121, 2128));
		tokens.add(new CorpusRefinerToken(2129, 2131));
		tokens.add(new CorpusRefinerToken(2132, 2138));
		tokens.add(new CorpusRefinerToken(2139, 2144));
		tokens.add(new CorpusRefinerToken(2145, 2148));
		tokens.add(new CorpusRefinerToken(2149, 2153));
		tokens.add(new CorpusRefinerToken(2153, 2154));
		entities = new ArrayList<CorpusRefinerEntity>();
		sentences.add(new CorpusRefinerSentence(2006, 2154, "dummy-doc-001.txt-s-2006-2154", tokens, entities));
		tokens = new ArrayList<CorpusRefinerToken>();
		tokens.add(new CorpusRefinerToken(2155, 2159));
		tokens.add(new CorpusRefinerToken(2160, 2164));
		tokens.add(new CorpusRefinerToken(2165, 2167));
		tokens.add(new CorpusRefinerToken(2167, 2168));
		tokens.add(new CorpusRefinerToken(2169, 2172));
		tokens.add(new CorpusRefinerToken(2173, 2176));
		tokens.add(new CorpusRefinerToken(2177, 2188));
		tokens.add(new CorpusRefinerToken(2188, 2189));
		tokens.add(new CorpusRefinerToken(2190, 2194));
		tokens.add(new CorpusRefinerToken(2195, 2199));
		tokens.add(new CorpusRefinerToken(2200, 2204));
		tokens.add(new CorpusRefinerToken(2205, 2209));
		tokens.add(new CorpusRefinerToken(2210, 2217));
		tokens.add(new CorpusRefinerToken(2218, 2222));
		tokens.add(new CorpusRefinerToken(2223, 2224));
		tokens.add(new CorpusRefinerToken(2225, 2236));
		tokens.add(new CorpusRefinerToken(2236, 2237));
		tokens.add(new CorpusRefinerToken(2238, 2245));
		tokens.add(new CorpusRefinerToken(2246, 2250));
		tokens.add(new CorpusRefinerToken(2250, 2251));
		entities = new ArrayList<CorpusRefinerEntity>();
		entityTokens = new ArrayList<Integer>();
		entityTokens.add(0); // Nick
		entityTokens.add(1); // Dean
		entityTokens.add(2); // QC
		entities.add(new CorpusRefinerEntity("person", entityTokens));
		sentences.add(new CorpusRefinerSentence(2155, 2251, "dummy-doc-001.txt-s-2155-2251", tokens, entities));
		tokens = new ArrayList<CorpusRefinerToken>();
		tokens.add(new CorpusRefinerToken(2252, 2255));
		tokens.add(new CorpusRefinerToken(2256, 2261));
		tokens.add(new CorpusRefinerToken(2262, 2267));
		tokens.add(new CorpusRefinerToken(2268, 2272));
		tokens.add(new CorpusRefinerToken(2273, 2275));
		tokens.add(new CorpusRefinerToken(2276, 2278));
		tokens.add(new CorpusRefinerToken(2279, 2282));
		tokens.add(new CorpusRefinerToken(2283, 2289));
		tokens.add(new CorpusRefinerToken(2290, 2292));
		tokens.add(new CorpusRefinerToken(2293, 2301));
		tokens.add(new CorpusRefinerToken(2301, 2302));
		entities = new ArrayList<CorpusRefinerEntity>();
		sentences.add(new CorpusRefinerSentence(2252, 2302, "dummy-doc-001.txt-s-2252-2302", tokens, entities));
		documents
				.add(new CorpusRefinerDocument(
						"dummy-doc-001.txt",
						"The trial of eight retired police officers and two witnesses involved in a high-profile Welsh miscarriage of justice began yesterday in Swansea, south Wales. The ten are accused of framing three men for murder. The Independent Police Complaints Commission thinks it is the largest trial of police the UK has ever seen.\n\n20-year-old prostitute Lynette White was murdered in her Cardiff flat in 1988. Two years later, the 'Cardiff Three' — Stephen Miller, Yusef Abdullahi and Tony Paris — were convicted of her murder. They were cleared on appeal in 1992. Cousins Ronnie and John Actie were tried alongside the Three, but cleared.\n\nIn 2003 the real killer, Jeffrey Gafoor, admitted the crime and was sentenced to life in prison. Gafoor, a client of White's, stabbed her more than 50 times.\n\nAll those presently accused deny the allegations against them. The eight policemen are accused of a joint conspiracy to pervert the course of justice in a plot to \"mould, manipulate, influence and fabricate evidence.\"\n\nAmongst these are three senior officers — chief superintendent Thomas Page, chief inspector Graham Mouncher and chief inspector Richard Powell. Mouncher also faces two charges of perjury — the offence of lying under oath in court. The junior officers accused in the conspiracy are Michael Daniels, Paul Jennings, Paul Stephen, Peter Greenwood, and John Seaford.\n\nAlongside Mouncher, original trial witnesses Violet Perriam and Ian Massey also face two counts of perjury each. Both were civilians working for the police. Perriam is said to have lied by saying she saw people including Actie at the crime scene; Massey's charges relate to his claiming Paris had confessed.\n\nThe ten defendants are being tried before Mr Justice Sweeney, who will also oversee a second trial next year in which four more police officers face related charges. The cases were not tried together because of practicalities.\n\nA jury was sworn in at Swansea Crown Court yesterday, drawn from a panel of 400 potential jurors. The judge warned them to take no heed of contemporary or historic reporting on any of the trials, and refrain from talking to anyone about the case. Nick Dean QC, for the prosecution, told them they were dealing with a complicated, unusual case. The trial could take up to six months to complete.\n",
						sentences));
		return documents;
	}
}
