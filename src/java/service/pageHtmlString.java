/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 *
 * @author Yassine.SIMOU
 */
public class pageHtmlString {

    public String sendHtmlEmail(String nom, String password) {
        String page = "<!DOCTYPE html>\n"
                + "<html>\n"
                + "<head>\n"
                + "	<meta charset=\"utf-8\">\n"
                + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                + "	<title>OCP-UM6P</title>\n"
                + "\n"
                + "	<style type=\"text/css\">\n"
                + "	.footer-copyright {\n"
                + "		background-color: #e8e8e8;\n"
                + "		padding-top: 3px;\n"
                + "		padding-bottom: 3px;\n"
                + "		text-align: center;\n"
                + "	}\n"
                + "	.wrap-login100 {\n"
                + "		width: 670px;\n"
                + "		background: #fff;\n"
                + "		border-radius: 10px;\n"
                + "		overflow: hidden;\n"
                + "		position: relative;\n"
                + "	}\n"
                + "	/*[ Title form ]*/\n"
                + "	.login100-form-title {\n"
                + "		width: 100%;\n"
                + "		position: relative;\n"
                + "		z-index: 1;\n"
                + "		display: -webkit-box;\n"
                + "		display: -webkit-flex;\n"
                + "		display: -moz-box;\n"
                + "		display: -ms-flexbox;\n"
                + "		display: flex;\n"
                + "		flex-wrap: wrap;\n"
                + "		flex-direction: column;\n"
                + "		align-items: center;\n"
                + "\n"
                + "		background-repeat: no-repeat;\n"
                + "		background-size: cover;\n"
                + "		background-position: center;\n"
                + "\n"
                + "		/*padding: 70px 15px 74px 15px;*/\n"
                + "	}\n"
                + "\n"
                + "	.login100-form-title-1 {\n"
                + "		font-family: Poppins-Bold;\n"
                + "		font-size: 26px;\n"
                + "		color: #000;\n"
                + "		text-transform: uppercase;\n"
                + "		line-height: 1.2;\n"
                + "		text-align: center;\n"
                + "		padding-top: 10px;\n"
                + "		padding-bottom: 10px;\n"
                + "	}\n"
                + "\n"
                + "	.login100-form-title::before {\n"
                + "		content: \"\";\n"
                + "		display: block;\n"
                + "		position: absolute;\n"
                + "		z-index: -1;\n"
                + "		width: 100%;\n"
                + "		height: 100%;\n"
                + "		top: 0;\n"
                + "		left: 0;\n"
                + "		background-color: rgba(1,125,78,0.6) !important;\n"
                + "	}\n"
                + "	.container{width:100%;padding-right:15px;padding-left:15px;margin-right:auto;margin-left:auto}\n"
                + "	.row{display:-webkit-box;display:-ms-flexbox;display:flex;-ms-flex-wrap:wrap;flex-wrap:wrap;margin-right:-15px;margin-left:-15px}\n"
                + "	.col-md-4{-webkit-box-flex:0;-ms-flex:0 0 33.333333%;flex:0 0 33.333333%;max-width:33.333333%}\n"
                + "	.col-md-4{position:relative;width:100%;min-height:1px;padding-right:15px;padding-left:15px}\n"
                + "	.img-rounded{\n"
                + "		border-radius: 100%;\n"
                + "		margin-top: 20px;\n"
                + "		width: 120px;\n"
                + "		height: 120px;\n"
                + "	}\n"
                + "</style>\n"
                + "</head>\n"
                + "<body>\n"
                + "	<div class=\"wrap-login100\">\n"
                + "\n"
                + "		<div class=\"container login100-form-title\" style=\"background-color: #148F77\">\n"
                + "			<div class=\"row\">\n"
                + "				<div class=\"col-md-4\" ></div>\n"
                + "				<div class=\"col-md-4 login100-form-title-1\">\n"
                + "					<span >\n"
                + "						Reset Password\n"
                + "					</span>\n"
                + "				</div>\n"
                + "				<div class=\"col-md-4\"></div>\n"
                + "\n"
                + "			</div>\n"
                + "		</div>\n"
                + "\n"
                + "		<div>\n"
                + "			<h1>Welcome,</h1><h1>" + nom + "</h1>\n"
                + "			<p>You recently asked to reset your password for your OCP account,\n"
                + "				<strong>Here is your New password.</strong></p> <strong> " + password + "</strong>\n"
                + "			</div>\n"
                + "<br></br>\n"
                + "			<div class=\"footer-copyright\" style=\"background-color: #148F77\">\n"
                + "				<p>2018 © UM6P </p>\n"
                + "			</div>\n"
                + "\n"
                + "		</div>\n"
                + "	</body>\n"
                + "	</html>";
        return page;
    }

    public String signHtmlPage(String nom, String password,String login) {
        String page = "<!DOCTYPE html>\n"
                + "<html>\n"
                + "<head>\n"
                + "	<meta charset=\"utf-8\">\n"
                + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                + "	<title>OCP-UM6P</title>\n"
                + "\n"
                + "	<style type=\"text/css\">\n"
                + "	.footer-copyright {\n"
                + "		background-color: #e8e8e8;\n"
                + "		padding-top: 3px;\n"
                + "		padding-bottom: 3px;\n"
                + "		text-align: center;\n"
                + "	}\n"
                + "	.wrap-login100 {\n"
                + "		width: 670px;\n"
                + "		background: #fff;\n"
                + "		border-radius: 10px;\n"
                + "		overflow: hidden;\n"
                + "		position: relative;\n"
                + "	}\n"
                + "	/*[ Title form ]*/\n"
                + "	.login100-form-title {\n"
                + "		width: 100%;\n"
                + "		position: relative;\n"
                + "		z-index: 1;\n"
                + "		display: -webkit-box;\n"
                + "		display: -webkit-flex;\n"
                + "		display: -moz-box;\n"
                + "		display: -ms-flexbox;\n"
                + "		display: flex;\n"
                + "		flex-wrap: wrap;\n"
                + "		flex-direction: column;\n"
                + "		align-items: center;\n"
                + "\n"
                + "		background-repeat: no-repeat;\n"
                + "		background-size: cover;\n"
                + "		background-position: center;\n"
                + "\n"
                + "		/*padding: 70px 15px 74px 15px;*/\n"
                + "	}\n"
                + "\n"
                + "	.login100-form-title-1 {\n"
                + "		font-family: Poppins-Bold;\n"
                + "		font-size: 30px;\n"
                + "		color: #000;\n"
                + "		text-transform: uppercase;\n"
                + "		line-height: 1.2;\n"
                + "		text-align: center;\n"
                + "		padding-top: 65px;\n"
                + "		padding-bottom: 67px;\n"
                + "	}\n"
                + "\n"
                + "	.login100-form-title::before {\n"
                + "		content: \"\";\n"
                + "		display: block;\n"
                + "		position: absolute;\n"
                + "		z-index: -1;\n"
                + "		width: 100%;\n"
                + "		height: 100%;\n"
                + "		top: 0;\n"
                + "		left: 0;\n"
                + "		background-color: rgba(1,125,78,0.6) !important;\n"
                + "	}\n"
                + "	.container{width:100%;padding-right:15px;padding-left:15px;margin-right:auto;margin-left:auto}\n"
                + "	.row{display:-webkit-box;display:-ms-flexbox;display:flex;-ms-flex-wrap:wrap;flex-wrap:wrap;margin-right:-15px;margin-left:-15px}\n"
                + "	.col-md-4{-webkit-box-flex:0;-ms-flex:0 0 33.333333%;flex:0 0 33.333333%;max-width:33.333333%}\n"
                + "	.col-md-4{position:relative;width:100%;min-height:1px;padding-right:15px;padding-left:15px}\n"
                + "	.img-rounded{\n"
                + "		border-radius: 100%;\n"
                + "		margin-top: 20px;\n"
                + "		width: 120px;\n"
                + "		height: 120px;\n"
                + "	}\n"
                + "</style>\n"
                + "</head>\n"
                + "<body>\n"
                + "	<div class=\"wrap-login100\">\n"
                + "\n"
                + "		<div class=\"container login100-form-title\" style=\"background-color: #148F77\">\n"
                + "			<div class=\"row\">\n"
                + "				<div class=\"col-md-4\" ></div>\n"
                + "				<div class=\"col-md-4 login100-form-title-1\">\n"
                + "					<span >\n"
                + "						SIGN IN\n"
                + "					</span>\n"
                + "				</div>\n"
                + "				<div class=\"col-md-4\"></div>\n"
                + "\n"
                + "			</div>\n"
                + "		</div>\n"
                + "\n"
                + "		<div>\n"
                + "			<h1>Welcome,</h1><h1>"+nom+"</h1>\n"
                + "			<p>You can login to your OCP account, Using :\n"
                + "			       "+login+", OR This mail, \n"
                + "				<strong>Here is your password.</strong></p> <strong> "+password+"</strong>\n"
                + "			<p>If you have problems with your account or forget your password, we will use this address to get in touch with you.</p>\n"
                + "			<p>We hope you enjoy your new mail!</p>	\n"
                + "			</div>\n"
                + "<br></br>\n"
                + "			<div class=\"footer-copyright\" style=\"background-color: #148F77\">\n"
                + "				<p>2018 © UM6P </p>\n"
                + "			</div>\n"
                + "\n"
                + "		</div>\n"
                + "	</body>\n"
                + "	</html>";
        return page;
    }
}
