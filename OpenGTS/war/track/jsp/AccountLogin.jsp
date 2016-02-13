<script type="text/javascript" >
angular.module('jittrack', [])
  .controller('LoginCtrl', function($scope) {
	<% String data = (String) request.getAttribute("data"); %>
    var data = angular.fromJson(<%= data %>);
    angular.extend($scope, data);
  });
 </script>

<div ng-app="jittrack" ng-controller="LoginCtrl">
    <table class="{{cssLoginContent}}" width='100%' cellpadding='0' cellspacing='0' border='0' ng-controller="LoginCtrl">
      <tr>
        <td class="{{CSS_LOGIN_VSEP_CELL}}" ng-if="vsepImg">
          <img width={{vsepImg.width}} height={{vsepImg.height}} />
        </td>
        <td class="{{cssLoginText}}">
          <span style='font-size:11pt'>{{enterLoginText}}</span>
          <hr style='height: 5px;' ng-if="HR" />
          <form name={{form.name}} method='post' action={{form.action}} target={{form.target}}>
            <table class={{cssLoginFormTable}} cellpadding='0' cellspacing='0' border='0'>
              <tr ng-repeat="f in form.fields">
                <td class='accountLoginFieldLabel' ng-if="f.type == 'text' || f.type == 'password' || (f.type == 'combobox' && f.editable != null)">{{f.label}}</td>
                <td class='accountLoginFieldValue' ng-if="f.type == 'text' || f.type == 'password'">
                  <input id="{{f.id}}" class="{{f.class}}" type={{f.type}} ngReadonly="ro" name="{{f.name}}" ng-model="f.value" size="{{f.size}}" maxlength="{{f.maxlength}}">
                </td>
                <td class='accountLoginFieldValue' ng-if="f.type == 'combobox' && f.editable != null">
                  <select id="{{f.id}}" class="{{f.class}}" name="{{f.name}}" ng-style="f.size>0?{'width':(f.size*8)+'px'}:{}" ng-model="f.value" ng-options="key as value for (key, value) in f.option">
                  </select>
                </td>
              </tr>
            </table>
            <br>
            <input type='submit' name='submit' value="Login">
            <span style='font-size:8pt;padding-left:10px;' ng-if="forgot"><i><a href='{{forgot.url}}'>{{forgot.text}}</a></i></span>
          </form>
          <br/>
          <span style='font-size:8pt'><i>"+i18n.getString("AccountLogin.cookiesJavaScript","(Cookies and JavaScript must be enabled)")+"</i></span>
          <br/>
          <br/>
          <div ng-if="demo">
            <hr style='height: 5px;' ng-if="HR" />
            <form name='{{demoForm.name}}' method='post' action='{{demoForm.baseURL}}' target='{{demoForm.target}}}'>
              <input type='hidden' name='"+Constants.PARM_ACCOUNT  +"' value='"+reqState.getDemoAccountID()+"' />
              <input type='hidden' name='"+Constants.PARM_USER     +"' value='' />
              <input type='hidden' name='"+Constants.PARM_PASSWORD +"' value='' />
              <span style='font-size:9pt;padding-right:5px;'>"+i18n.getString("AccountLogin.freeDemo","Or click here for a demonstration")+"</span>
              <input type='submit' name='submit' value='"+i18n.getString("AccountLogin.demo","Demo")+"'>
            </form>
          </div>
          <div ng-if="newURL">
            <hr style='height: 5px;' ng-if="HR" />
            <span style='font-size:8pt'><i><a href='"+newURL+"'>"+i18n.getString("AccountLogin.freeAccount","Sign up for a free account")+"</a></i></span>
          </div>
        </td>
      </tr>
    </table>
  </div>
