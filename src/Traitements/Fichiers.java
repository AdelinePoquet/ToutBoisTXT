/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Traitements;

import Entites.*;
import Exception.FormatMailException;
import java.io.*;
import static toutbois.Application.*;



/**
 *
 * @author ajugnon
 * sources jpaul
 */
public class Fichiers {
    /**
     * 
     * Récupère le nom du fichier à lire et écrire
     */
    public static String nomfic;
    
    /**
     * Méthode servant a lire le fichier passé en paramètre
     * et ajoute les données dans la collection @c
     * Peut lever une exception IOException si problème de lecture
     * Peut lever une exception NumberFormatException si lors de la saisie on inscrit autre chose
     * que des chiffres dans les champs Tel,NumRep,NbCom
     * @param typefic récupére le type de fichier Client, Représentant ou Prospect
     * @param nomfic récupère le nom du fichier à lire
     */
    public static void ouvrir_fichier(char typefic, String nomfic) 
    { 
        int numLigne = 0;
        try
        { 
            InputStream ips = new FileInputStream(nomfic); 
            InputStreamReader ipsr = new InputStreamReader(ips); 
            try (BufferedReader br = new BufferedReader(ipsr)) {
                String ligne;
                
                
                while ((ligne = br.readLine()) != null)
                {
                    numLigne++;
                    //System.out.println(ligne);
                    String[] splitArray = ligne.split(";");
                    
                    switch (typefic)//client, prospect, representant
                    {
                        case 'C':
                            Client cli = new Client();
                            numLigne = Integer.parseInt(splitArray[0]);
                            cli.setNumCli(numLigne);
                            cli.setEnseigne(splitArray[1]);
                            cli.setVille(splitArray[2]);
                            cli.setTel(Integer.parseInt(splitArray[3]));
                            cli.setNumRep(Integer.parseInt(splitArray[4]));
                            cli.setNbCom(Integer.parseInt(splitArray[5]));
                            cli.setCedex(Integer.parseInt(splitArray[6]));
                            cli.setCompAdd(splitArray[7]);
                            cli.setCp(Integer.parseInt(splitArray[8]));
                            cli.setMail(splitArray[9]);
                            cli.setNumRue(Integer.parseInt(splitArray[10]));
                            cli.setPays(splitArray[11]);
                            cli.setRue(splitArray[12]);
                            cli.setSiret(Integer.parseInt(splitArray[13]));
                            cli.setVoie(splitArray[14]);
                            c.add(cli);
                            break;
                        case 'P':
                            Prospect pro = new Prospect();
                            pro.setDerniereVisite(splitArray[0]);
                            pro.setEnseigne(splitArray[1]);
                            pro.setMail(splitArray[2]);
                            pro.setPays(splitArray[3]);
                            pro.setRue(splitArray[4]);
                            pro.setVille(splitArray[5]);
                            pro.setVoie(splitArray[6]);
                            pro.setCedex(Integer.parseInt(splitArray[7]));
                            pro.setCp(Integer.parseInt(splitArray[8]));
                            pro.setNumRue(Integer.parseInt(splitArray[9]));
                            pro.setSiret(Integer.parseInt(splitArray[10]));
                            pro.setTel(Integer.parseInt(splitArray[11]));
                            pro.setCompAdd(splitArray[12]);
                            p.add(pro);
                            break;
                         case 'R':
                            Representant rep = new Representant();
                            rep.setNom(splitArray[0]);
                            rep.setPrenom(splitArray[1]);
                            rep.setNum(Integer.parseInt(splitArray[2]));
                            rep.setTaux(Integer.parseInt(splitArray[3]));
                            rep.setSalaire(Integer.parseInt(splitArray[4]));
                            r.add(rep);
                            break;
                    }
                    Client.setCptNumCli(numLigne);
                }
                
            }
        } 
        catch (IOException | NumberFormatException e)
        { 
            System.out.println(e.toString()); 
        } 

    }
    
    /**
     * Permet de fermer le fichier et d'enregistrer les données en fonction du type de fichier passé en paramètre
     * 
     * @param typefic soit Client,Prospect ou Représentant
     * @param nomfic récupere le nom du fichier
     * @throws IOException Peut lever une exception IOException
     */
    public static void fermer_fichier(char typefic, String nomfic) throws IOException 
    { 
        File nomFichier;
        
        String mycontent;
      
        nomFichier = new File(nomfic);
        
        if (! nomFichier.exists())
        {
            nomFichier.createNewFile();
        }
        try
        {
            PrintWriter pw = new PrintWriter (new BufferedWriter (new FileWriter (nomFichier)));
            switch (typefic)//client, prospect, representant
                {
                    case 'C':
            for (Client monCli : c) {
                mycontent = monCli.getNumCli()+";"+monCli.getEnseigne()+";"+monCli.getVille()+";"+monCli.getTel()+";"+monCli.getNumRep()+";"+monCli.getNbCom()+";"+monCli.getCedex()+";"+monCli.getCompAdd()+";"+monCli.getCp()+";"+monCli.getMail()+";"+monCli.getNumRue()+";"+monCli.getPays()+";"+monCli.getRue()+";"+monCli.getSiret()+";"+monCli.getVoie();
                pw.println(mycontent);
            }
                        pw.close();
                        break;
                    
                    case 'P':
            for (Prospect monPro : p) {
                mycontent = monPro.getDerniereVisite()+";"+monPro.getEnseigne()+";"+monPro.getMail()+";"+monPro.getPays()+";"+monPro.getRue()+";"+monPro.getVille()+";"+monPro.getVoie()+";"+monPro.getCedex()+";"+monPro.getCp()+";"+monPro.getNumRue()+";"+monPro.getSiret()+";"+monPro.getTel()+";"+monPro.getCompAdd();
                pw.println(mycontent);
            }
                        pw.close();
                        break;
                    case 'R':
            for (Representant monRep : r) {
                mycontent = monRep.getNom()+";"+monRep.getPrenom()+";"+monRep.getNum()+";"+monRep.getTaux()+";"+monRep.getSalaire();
                pw.println(mycontent);
            }
                        pw.close();
                        break;
                }
        }
        catch (IOException exception)
        {
            System.out.println ("Erreur lors de la lecture : " + exception.getMessage());
        }
        
        
            
    }
    
}
