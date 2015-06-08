# Top 100 Word Frequency
####author: Laurence Bohannan

####time taken: 1 hour 45 mins


### Description
This application contains a simple method to process the input text file and provide a list of the top 100 most frequent words found in the text. If no file was specified on the command line argument then the default input file that was supplied will be used.

## Quickstart

To install please make sure you have Java version 1.7 and Apache Maven 3.2.3 installed.

### Building
 To build the application please run the following command from your command line terminal in the project directory.

```bash
$ mvn clean install
```

note: please make sure you all your environmental variables set for Maven properly.

### Running
To execute the application please run the following command from your command line terminal in the project directory.

```bash
$ java -jar target/word-freq-1.0-SNAPSHOT.jar
```

### Input
To change the input text which is used in the application please pass in a command line argument:
```bash
$ java -jar target/word-freq-1.0-SNAPSHOT.jar testFile.text
```

## Output
Expected output results of the default execution will be displayed to the terminal. It will look like the output below:

```bash
Total word count: 2136
Rank	Word	Count	Relative Freq. %
1	the	108	5.056
2	bush	66	3.090
3	and	58	2.715
4	to	43	2.013
5	of	39	1.826
6	in	36	1.685
7	barbara	30	1.404
8	her	28	1.311
9	was	27	1.264
10	george	26	1.217
11	a	24	1.124
12	for	23	1.077
13	on	22	1.030
14	she	21	0.983
15	в	21	0.983
16	i	17	0.796
17	that	14	0.655
18	w	13	0.609
19	as	13	0.609
20	de	12	0.562
21	en	12	0.562
22	at	12	0.562
23	with	12	0.562
24	had	11	0.515
25	texas	11	0.515
26	буш	11	0.515
27	bushes	11	0.515
28	la	11	0.515
29	from	11	0.515
30	y	10	0.468
31	husband	10	0.468
32	is	10	0.468
33	by	9	0.421
34	after	9	0.421
35	not	8	0.375
36	houston	8	0.375
37	president	7	0.328
38	day	7	0.328
39	he	7	0.328
40	hospital	7	0.328
41	an	7	0.328
42	maine	7	0.328
43	h	6	0.281
44	new	6	0.281
45	барбара	6	0.281
46	family	6	0.281
47	people	6	0.281
48	their	6	0.281
49	и	6	0.281
50	el	6	0.281
51	son	6	0.281
52	this	6	0.281
53	about	6	0.281
54	pierce	6	0.281
55	literacy	5	0.234
56	library	5	0.234
57	буша	5	0.234
58	january	5	0.234
59	because	5	0.234
60	what	5	0.234
61	award	5	0.234
62	former	5	0.234
63	they	5	0.234
64	school	5	0.234
65	york	5	0.234
66	lady	5	0.234
67	foundation	4	0.187
68	there	4	0.187
69	сша	4	0.187
70	сын	4	0.187
71	while	4	0.187
72	los	4	0.187
73	awards	4	0.187
74	время	4	0.187
75	been	4	0.187
76	года	4	0.187
77	first	4	0.187
78	england	4	0.187
79	or	4	0.187
80	them	4	0.187
81	it	4	0.187
82	two	4	0.187
83	served	4	0.187
84	su	4	0.187
85	fue	4	0.187
86	so	4	0.187
87	governor	4	0.187
88	го	4	0.187
89	went	4	0.187
90	center	4	0.187
91	america	4	0.187
92	del	4	0.187
93	want	4	0.187
94	event	3	0.140
95	march	3	0.140
96	дочь	3	0.140
97	released	3	0.140
98	april	3	0.140
99	which	3	0.140
100	september	3	0.140
```

### Design Decisions
For the overall flow of the application I decided it would be easiest to first split the input text into separate words. Once this was accomplished then it was easy just to iterate across this list and create a HashMap which would keep track of the number of times that each word was encountered in the array.

After this I copied the results to a list and passed in a custom comparator to preform a sort so the list would be from high occurrences to least. Now just by looping through this sorted list I could output the words in their correct ranking.
