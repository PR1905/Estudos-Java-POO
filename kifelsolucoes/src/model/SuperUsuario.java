package model;

public class SuperUsuario extends User {
    private Double salario;

    public SuperUsuario() {
    }

    public SuperUsuario(String name, Double salario) {
        super(name);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + "[salario=" + salario + "]";
    }

    
}
 