# 심심풀이 코딩 놀이

##### 소수찾기 - findPrime.java

###### 문제 설명
```
1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.

소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
(1은 소수가 아닙니다.)
```
###### 제한 조건
- n은 2이상 1000000이하의 자연수입니다.

###### 입출력 예
- 1부터 10 사이의 소수는 [2,3,5,7] 4개가 존재하므로 4를 반환
- 1부터 5 사이의 소수는 [2,3,5] 3개가 존재하므로 3를 반환

출처: [Programmers](https://programmers.co.kr/learn/courses/30/lessons/12921)
- - -

##### 완주하지 못한 선수 - Marathon.java
```
수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 
완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
```
###### 제한 조건
- 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
- completion의 길이는 participant의 길이보다 1 작습니다.
- 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
- 참가자 중에는 동명이인이 있을 수 있습니다.

###### 입출력 예
```
participant	completion	return
[leo, kiki, eden]	[eden, kiki]	leo
[marina, josipa, nikola, vinko, filipa]	[josipa, filipa, marina, nikola]	vinko
[mislav, stanko, mislav, ana]	[stanko, ana, mislav]	mislav

예제 #1
leo는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

예제 #2
vinko는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

예제 #3
mislav는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.
```

출처 - [Programmers](https://programmers.co.kr/learn/courses/30/lessons/42576)
- - -

##### 전화번호 목록 - AddressBook.java

###### 문제 설명
```
전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.

구조대 : 119
박준영 : 97 674 223
지영석 : 11 9552 4421

전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 
어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 
solution 함수를 작성해주세요.
```

###### 제한 조건
- phone_book의 길이는 1 이상 1,000,000 이하입니다.
- 각 전화번호의 길이는 1 이상 20 이하입니다.

###### 입출력 예
```
phone_book	return
[119, 97674223, 1195524421]	false
[123,456,789]	true
[12,123,1235,567,88]	false
```

###### 입출력 예 설명
```
입출력 예 #1
앞에서 설명한 예와 같습니다.

입출력 예 #2
한 번호가 다른 번호의 접두사인 경우가 없으므로, 답은 true입니다.

입출력 예 #3
첫 번째 전화번호, “12”가 두 번째 전화번호 “123”의 접두사입니다. 따라서 답은 false입니다.
```

출처 - [Programmers](https://programmers.co.kr/learn/courses/30/lessons/42577)
- - -

##### 양말짝 찾기 - SockMerchant.java
```
John works at a clothing store. He has a large pile of socks that he must pair by color for sale. 
Given an array of integers representing the color of each sock, 
determine how many pairs of socks with matching colors there are.

For example, there are n = 7 socks with colors ar = [1,2,1,2,1,3,2]. 
There is one pair of color  and one of color 1 and one of color 2. 
There are three odd socks left, one of each color. The number of pairs is 2.
```

###### Function Description
```
Complete the sockMerchant function in the editor below. 
It must return an integer representing the number of matching pairs of socks that are available.

sockMerchant has the following parameter(s):

- n: the number of socks in the pile
- ar: the colors of each sock
```

###### Input Format
```
The first line contains an integer , the number of socks represented in .
The second line contains  space-separated integers describing the colors  of the socks in the pile.
```

###### Constraints
- 1 <= n <= 100
- 1 <= ar[i] <= 100 where 0 <= i < n
 
###### Output Format
```
Return the total number of matching pairs of socks that John can sell.
```

###### Sample Input
- n: 9
- ar: [10 20 20 10 10 30 50 10 20]

###### Sample Output
- 3

출처 - [Hackerrank](https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=warmup&isFullScreen=true)
