## Project for test task

> This project consist a simple algorithm to cut website titles and some unit tests. Also are use Allure Report to visialist unit tests results.

# <a name="Description">Description</a>

The test project consists of Web, API and mobile(android) tests.\
A brief list of interesting facts about the project:

- [x] `Page Object` with steps using `Chain of Invocations`
- [x] Fake data generating with `Faker` library
- [x] Parametrized build
- [x] Different configuration files for test running depending on build parameters
- [x] Config with `Owner` library
- [x] `Allure TestOps` integration

## <a name="Coverage">Coverage of unit tests</a>

+ Title length above upper border
+ Title length within border
+ Title length equal upper border
+ Title length equal upper border and last character is space
+ Enter title on language which different from English
+ Empty title string
+ Title string is null

## <a name="HowToRun">How to run</a>

### <a name="GradleCommand">Local running</a>

To run locally download project and use command:


```bash
gradle  run -Dtitle="Volvo released a new car with the following spec: 
V6 236HP. It will cost 22647 and going to be sold in New York" -Dlen=25
```
> - *title* - string for cutting
>- *len* - length of title which will be show on website

To run Unit tests:

```bash
gradle clean test
```

### <a name="Localrun">Remote running</a>

Fot remote running was used GitHub CI. You need to: 

```properties
click to "Actions" -> 
click to "Test" -> 
click to "Run workflow" ->
click to "Run workflow"
```
<p  align="center">
<img src="resources/gif1.gif" alt="ActionsVideo" width="800">
</p>

## <a name="PropertyFiles">Property files</a>

Possible properties in a `${env}.properties` file:

```properties
remoteUrl=
browserSize=
browser=
browserVersion=
baseUrl=
isRemote=
```

> - *remoteUrl* - URL for remote WebDriver
>- *browserSize* - size of browser for Web tests
>- *browser* - browser for Web tests
>- *browserVersion* - version of browser
>- *baseUrl* - base URL for Web tests
>- *isRemote* - flag for local/remote running

### <a name="PropertyFilesDefaults">Default property files</a>

    local.properties

```properties
remoteUrl=https://user1:1234@selenoid.autotests.cloud/
browserSize=1920x1080
browser=chrome
browserVersion=100.0
baseUrl=https://www.reddit.com/
isRemote=false
```

## <a name="RunInJenkins">Run in [Jenkins](https://jenkins.autotests.cloud/job/reddit_tests//)</a>

Click on "Build with Parameters" button, after that click on "Build":
<p  align="center">
<img src="images/screen/gif_reddit.gif" alt="JenkinsBuildMainPage" width="800">
</p>

File with credentials from Reddit account has already attached.
<p  align="center">
<img src="images/screen/2023-01-10_17-23-21.png" alt="JenkinsBuildMainPage" width="800">
</p>

# <a name="TelegramNotifications">Telegram Notifications</a>

Telegram bot sends a report to a special telegram chat by results of each build. Information about bot setting you can
find by link:https://github.com/qa-guru/allure-notifications. Bot also can be use for Slack, Email notifications.
<p  align="center">
<img src="images/screen/2023-01-10_19-04-54.png" alt="TelegramNotification" width="450">
</p>

# <a name="AllureReport">Test results report in [Allure Report](https://jenkins.autotests.cloud/job/reddit_tests/allure/)</a>

## Main page

Main page of Allure report contains some general information about ran tests.

<p align="center">
  <img src="images/screen/2023-01-10_19-11-29.png" alt="AllureReportMain" width="950">
</p>

## List of tests with steps and test artefacts

On the page the list of the tests grouped by suites with status shown for each test.

<p align="center">
  <img src="images/screen/allure.png" alt="AllureReportSuites" width="1150">
</p>

Each test has artefacts:
> - Screenshot
>- Page Source
>- Browser console log
>- Video

## Example video of test run from Allure report

<p align="left">
  <img src="images/screen/video.gif" alt="AllureReportSuites2" width="900">
</p>



