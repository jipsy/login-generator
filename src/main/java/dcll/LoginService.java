package dcll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * Classe de service permettant la gestion des login.
 */
public class LoginService {

    /**
     * Liste des login Existants.
     */
    private ArrayList<String> loginsExistants;

    /**
     * Construit un login service a partir de la liste des logins existants.
     * @param loginsExistants
     */
    public LoginService(String[] loginsExistants) {
        this.loginsExistants = new ArrayList<String>(Arrays.asList(loginsExistants));
        Collections.sort(this.loginsExistants);
    }

    /**
     * Verifie si un login existe deja.
     *
     * @param login le login a verifier
     * @return true si le login existe deja, false sinon
     */
    public boolean loginExists(String login) {
        return loginsExistants.contains(login);
    }

    /**
     * Ajoute un login a la liste des logins existants.
     * @param login le login a ajouter
     */
    public void addLogin(final String login) {
        loginsExistants.add(login);
    }

    /**
     * Recherche tous les logins commençant par un meme prefixe.
     *
     * @param pref le prefixe
     * @return la liste des logins prefixes par <em>pref</em>
     */
    public List<String> findAllLoginsStartingWith(final String pref) {
        ArrayList<String> loginsPrefixes = new ArrayList<String>();
        for (String login: loginsExistants) {
            if (login.startsWith(pref)) {
                loginsPrefixes.add(login);
            }
        }
        return  loginsPrefixes;
    }

    /**
     * Recherche tous les logins.
     *
     * @return la liste de tous les logins
     */
    public List<String> findAllLogins() {
        return  loginsExistants;
    }
}
