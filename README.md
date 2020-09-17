# SPRING LEVEL 1
#### 20.09.17 <초기 설정>
##### [Window] - [Market place] 에서 sts 검색 후 Spring 확장 프로그램을 설치
##### [File] - [new] - [Other] - [Spring Legacy Project] 에서 next를 눌러 Spring MVC Project로 생성
##### [Window] - [Perspective] - [Open perspective] - [Other] 에서 Spring으로 개발 환경 전환
##### [Project]를 우클릭 후 [Property] 클릭, [Project Facet]에서 Java의 버전을 1.8로 변경, Runtimes에서 apache tomcat을 체크한 후 apply
##### [Project] - [src] - [main] - [WEB-INF] - web.xml 파일 내의 설정들을 전부 삭제
##### [Project] - pom.xml 의 java-version을 1.8로, org.springframework-version의 내용을 4.3.29.RELEASE로 변경