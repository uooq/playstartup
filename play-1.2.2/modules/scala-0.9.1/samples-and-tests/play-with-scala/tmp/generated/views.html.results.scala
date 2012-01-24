
                    package views.html

                    import play.templates._
                    import play.templates.TemplateMagic._
                    import views.html._

                    object results extends BaseScalaTemplate[Html,Format[Html]](HtmlFormat) {

                        def apply/*1.2*/(results:Seq[String]):Html = {
                            try {
                                _display_ {

format.raw/*1.23*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>Play with Scala</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <link rel="stylesheet" type="text/css" media="screen" href="""")+_display_(/*9.70*/asset("public/stylesheets/main.css"))+format.raw/*9.106*/("""">
        <link rel="shortcut icon" type="image/png" href="""")+_display_(/*10.59*/asset("public/images/favicon.png"))+format.raw/*10.93*/("""">
        <script src="""")+_display_(/*11.23*/asset("public/javascripts/jquery-1.4.2.min.js"))+format.raw/*11.70*/("""" type="text/javascript" charset="utf-8"></script>
    </head>
    <body>
        
        <h1>Play with scala</h1>
        <h2>— the easiest way to learn scala</h2>
        
        <p>
            Life’s too short to not play with scala. You've got the easiest way to learn it. Just edit the <a href="""")+_display_(/*19.118*/play/*19.122*/.utils.Utils.open("app/scrapbook.scala", 1))+format.raw/*19.165*/("""">scrapbook.scala</a> file and refresh this page;
            it will execute the Scrapbook class and display all results of print(…) calls here.
        </p> 
        
        <div id="results">
            """)+_display_(/*24.14*/results/*24.21*/.zipWithIndex.map/*24.38*/ { e =>format.raw/*24.45*/("""
                <div class="print """)+_display_(/*25.36*/(if(e._2 % 2 == 0) "even" else "odd"))+format.raw/*25.73*/("""">
                    """)+_display_(/*26.22*/e/*26.23*/._1)+format.raw/*26.26*/("""
                </div>
            """)})+format.raw/*28.14*/("""
        </div>
        
        <h3>Resources,</h3>
        
        <p>
            New to scala? Here is a set of resources that will help you start:
        </p>
        
        <ul>
            <li><a href="http://www.codecommit.com/blog/scala/roundup-scala-for-java-refugees">Scala for Java Refugees</li>
            <li><a href="http://programming-scala.labs.oreilly.com/">Programming scala</a></li>
            <li><a href="http://aperiodic.net/phil/scala/s-99/">Ninety-Nine Scala Problems</a></li>
            <li><a href="http://www.scala-lang.org">And of course the official scala website</a></li>            
        </ul>
        
        <h4>Wait, there's more,</h4>
        
        <p>
            If you think playing with scala is fun, wait until you start coding a real web application with it. 
            <a href="http://www.playframework.org">Play! framework</a> is the easiest way to create a web application with Java and it has
            a <a href="http://www.playframework.org/modules/scala">scala module</a>.
        </p>
        
        <div id="footer">
            Play with scala is brought to you by <a href="http://guillaume.bort.fr">guillaume bort</a> and is part of the <a href="http://www.playframework.org/modules/scala">play scala module</a> distribution
        </div>
        
    </body>
</html>
""")}
                            } catch {
                                case e:TemplateExecutionError => throw e
                                case e => throw Reporter.toHumanException(e)
                            }
                        }

                    }

                
                /*
                    -- GENERATED --
                    DATE: Wed Jan 18 16:21:42 PST 2012
                    SOURCE: /app/views/results.scala.html
                    HASH: 23776b4e456d1fae31463f080217106eb5107095
                    MATRIX: 319->1|447->22|694->243|751->279|839->340|894->374|946->399|1014->446|1346->750|1360->754|1425->797|1661->1006|1677->1013|1703->1030|1729->1037|1792->1073|1850->1110|1901->1134|1911->1135|1935->1138|2001->1175
                    LINES: 10->1|14->1|22->9|22->9|23->10|23->10|24->11|24->11|32->19|32->19|32->19|37->24|37->24|37->24|37->24|38->25|38->25|39->26|39->26|39->26|41->28
                    -- GENERATED --
                */
            
