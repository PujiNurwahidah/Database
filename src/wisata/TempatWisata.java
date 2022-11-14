/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wisata;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author User
 */
@Entity
@Table(name = "tempat_wisata", catalog = "wisata_db", schema = "")
@NamedQueries({
    @NamedQuery(name = "TempatWisata.findAll", query = "SELECT t FROM TempatWisata t")
    , @NamedQuery(name = "TempatWisata.findByIdTempatWisata", query = "SELECT t FROM TempatWisata t WHERE t.idTempatWisata = :idTempatWisata")
    , @NamedQuery(name = "TempatWisata.findByNamaTempatWisata", query = "SELECT t FROM TempatWisata t WHERE t.namaTempatWisata = :namaTempatWisata")
    , @NamedQuery(name = "TempatWisata.findByAlamat", query = "SELECT t FROM TempatWisata t WHERE t.alamat = :alamat")
    , @NamedQuery(name = "TempatWisata.findByNoTelepon", query = "SELECT t FROM TempatWisata t WHERE t.noTelepon = :noTelepon")
    , @NamedQuery(name = "TempatWisata.findByKeterangan", query = "SELECT t FROM TempatWisata t WHERE t.keterangan = :keterangan")})
public class TempatWisata implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_tempat_wisata")
    private Integer idTempatWisata;
    @Basic(optional = false)
    @Column(name = "nama_tempat_wisata")
    private String namaTempatWisata;
    @Basic(optional = false)
    @Column(name = "alamat")
    private String alamat;
    @Basic(optional = false)
    @Column(name = "no_telepon")
    private String noTelepon;
    @Basic(optional = false)
    @Column(name = "keterangan")
    private String keterangan;

    public TempatWisata() {
    }

    public TempatWisata(Integer idTempatWisata) {
        this.idTempatWisata = idTempatWisata;
    }

    public TempatWisata(Integer idTempatWisata, String namaTempatWisata, String alamat, String noTelepon, String keterangan) {
        this.idTempatWisata = idTempatWisata;
        this.namaTempatWisata = namaTempatWisata;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
        this.keterangan = keterangan;
    }

    public Integer getIdTempatWisata() {
        return idTempatWisata;
    }

    public void setIdTempatWisata(Integer idTempatWisata) {
        Integer oldIdTempatWisata = this.idTempatWisata;
        this.idTempatWisata = idTempatWisata;
        changeSupport.firePropertyChange("idTempatWisata", oldIdTempatWisata, idTempatWisata);
    }

    public String getNamaTempatWisata() {
        return namaTempatWisata;
    }

    public void setNamaTempatWisata(String namaTempatWisata) {
        String oldNamaTempatWisata = this.namaTempatWisata;
        this.namaTempatWisata = namaTempatWisata;
        changeSupport.firePropertyChange("namaTempatWisata", oldNamaTempatWisata, namaTempatWisata);
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        String oldAlamat = this.alamat;
        this.alamat = alamat;
        changeSupport.firePropertyChange("alamat", oldAlamat, alamat);
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        String oldNoTelepon = this.noTelepon;
        this.noTelepon = noTelepon;
        changeSupport.firePropertyChange("noTelepon", oldNoTelepon, noTelepon);
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        String oldKeterangan = this.keterangan;
        this.keterangan = keterangan;
        changeSupport.firePropertyChange("keterangan", oldKeterangan, keterangan);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTempatWisata != null ? idTempatWisata.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TempatWisata)) {
            return false;
        }
        TempatWisata other = (TempatWisata) object;
        if ((this.idTempatWisata == null && other.idTempatWisata != null) || (this.idTempatWisata != null && !this.idTempatWisata.equals(other.idTempatWisata))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "wisata.TempatWisata[ idTempatWisata=" + idTempatWisata + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
