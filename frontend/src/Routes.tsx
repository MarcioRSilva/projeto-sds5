import Dashborad from 'pages/Dashbord';
import Home from 'pages/Home';
import { Route, Switch } from 'react-router';
import { BroserRouter } from 'react-router-dom';

const Routes = () => {
    return (
      <BroserRouter>
        <Switch>
            <Route path="/" exact>
                <Home />
            </Route>
            <Route path="/dasboard" exact>
                <Dashborad />
            </Route>
        </Switch>
      
      </BroserRouter>
    );
  }
  
  export default Routes;
  