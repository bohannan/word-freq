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
Total word count: 2130
Unique word count: 886
Rank	Word	Count	Frequency
1	the	108	0.121896163
2	bush	67	0.075620770
3	and	58	0.065462753
4	to	43	0.048532732
5	of	39	0.044018060
6	in	36	0.040632054
7	barbara	30	0.033860046
8	her	28	0.031602710
9	was	27	0.030474041
10	george	26	0.029345373
11	a	24	0.027088037
12	for	23	0.025959369
13	on	22	0.024830699
14	she	21	0.023702031
15	в	21	0.023702031
16	i	17	0.019187359
17	that	14	0.015801355
18	w	13	0.014672686
19	as	13	0.014672686
20	de	12	0.013544018
21	en	12	0.013544018
22	at	12	0.013544018
23	with	12	0.013544018
24	had	11	0.012415349
25	texas	11	0.012415349
26	буш	11	0.012415349
27	bushes	11	0.012415349
28	la	11	0.012415349
29	from	11	0.012415349
30	y	10	0.011286682
31	husband	10	0.011286682
32	is	10	0.011286682
33	by	9	0.010158014
34	after	9	0.010158014
35	not	8	0.009029346
36	houston	8	0.009029346
37	president	7	0.007900678
38	day	7	0.007900678
39	family	7	0.007900678
40	he	7	0.007900678
41	hospital	7	0.007900678
42	an	7	0.007900678
43	maine	7	0.007900678
44	h	6	0.006772009
45	new	6	0.006772009
46	барбара	6	0.006772009
47	people	6	0.006772009
48	their	6	0.006772009
49	и	6	0.006772009
50	el	6	0.006772009
51	son	6	0.006772009
52	this	6	0.006772009
53	about	6	0.006772009
54	pierce	6	0.006772009
55	literacy	5	0.005643341
56	library	5	0.005643341
57	буша	5	0.005643341
58	january	5	0.005643341
59	because	5	0.005643341
60	what	5	0.005643341
61	award	5	0.005643341
62	former	5	0.005643341
63	they	5	0.005643341
64	school	5	0.005643341
65	york	5	0.005643341
66	lady	5	0.005643341
67	foundation	4	0.004514673
68	there	4	0.004514673
69	сша	4	0.004514673
70	сын	4	0.004514673
71	while	4	0.004514673
72	los	4	0.004514673
73	awards	4	0.004514673
74	время	4	0.004514673
75	been	4	0.004514673
76	года	4	0.004514673
77	first	4	0.004514673
78	england	4	0.004514673
79	or	4	0.004514673
80	them	4	0.004514673
81	it	4	0.004514673
82	two	4	0.004514673
83	served	4	0.004514673
84	su	4	0.004514673
85	fue	4	0.004514673
86	so	4	0.004514673
87	governor	4	0.004514673
88	го	4	0.004514673
89	went	4	0.004514673
90	center	4	0.004514673
91	america	4	0.004514673
92	del	4	0.004514673
93	want	4	0.004514673
94	event	3	0.003386005
95	march	3	0.003386005
96	дочь	3	0.003386005
97	released	3	0.003386005
98	april	3	0.003386005
99	which	3	0.003386005
100	september	3	0.003386005
```

### Design Decisions
For the overall flow of the application I decided it would be easiest to first split the input text into separate words. Once this was accomplished then it was easy just to iterate across this list and create a HashMap which would keep track of the number of times that each word was encountered in the array.

After this I copied the results to a list and passed in a custom comparator to preform a sort so the list would be from high occurrences to least. Now just by looping through this sorted list I could output the words in their correct ranking.
