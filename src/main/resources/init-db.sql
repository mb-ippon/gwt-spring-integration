insert into country(id,code, libelle,version)
	Values
	(1,'SRB', 'Serbia',0),
	(2,'ESP', 'Spain',0),
	(3,'CHE', 'Switzerland',0),
	(4,'FRA', 'France',0),
	(5,'GBR', 'Great Britain',0),
	(6,'ARG', 'Argentina',0),
	(7,'CZE', 'Czech Republic',0);
insert into player(id, height, weight,atpPoint,yearTurnPro,name,playHand,country_id,birthDay,version)
	Values
	(1,188, 88,12260,2003,'Djokovic N.',0,1,TO_DATE('05/22/1987', 'MM/DD/YYYY'),0),
	(2,185, 85,13030,2001,'Nadal R.',1,2,TO_DATE('06/03/1986', 'MM/DD/YYYY'),0),
	(3,185, 85,4205,1998,'Federer R.',0,3,TO_DATE('08/08/1981', 'MM/DD/YYYY'),0),
	(4,188, 91,3065,2004,'Tsonga J.W.',0,4,TO_DATE('04/17/1985', 'MM/DD/YYYY'),0),
	(5,175, 73,5800,2000,'Ferrer D.',0,2,TO_DATE('02/04/1982', 'MM/DD/YYYY'),0),
	(6,190, 84,5790,2005,'Murray A.',0,5,TO_DATE('05/15/1987', 'MM/DD/YYYY'),0),
	(7,198, 97,5255,2005,'Del Potro J.M.',0,6,TO_DATE('09/23/1988', 'MM/DD/YYYY'),0),
	(8,196, 91,4180,2002,'Berdych T.',0,7,TO_DATE('09/17/1985', 'MM/DD/YYYY'),0),
	(9,183, 81,3730,2002,'Wawrinka S.',0,3,TO_DATE('03/28/1985', 'MM/DD/YYYY'),0),
	(10,185, 75,3300,2002,'Gasquet R.',0,4,TO_DATE('06/18/1986', 'MM/DD/YYYY'),0);
COMMIT;