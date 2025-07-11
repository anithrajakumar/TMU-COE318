package coe318.lab2;
/**
* ComplexNumber models a complex number expressed
* in rectangular form (real and imaginary parts).
* * It is an <em>immutable</em> object.
*
* @author Your Name
*/
public class ComplexNumber {
    //Instance variable declarations
    private double real_Num;
    private double imaginary_Num;
    
    
    /**
    * Construct a ComplexNumber given its
    * real and imaginary parts.
    * @param re The real component
    * @param im The imaginary component
    */
    public ComplexNumber(double re, double im) {
        //Initialize the instance variables
        this.real_Num = re;
        this.imaginary_Num = im;
    }
    
    /**
    * Returns the real component.
    * @return the real
    */
    public double getReal() {
        // Returns the real num of the complex number
        return this.real_Num; 
    }
    
    /**
    * Returns the imaginary component.
    * @return the imaginary
    */
    public double getImaginary() {
        // Returns the imginary number of the complex number
        return this.imaginary_Num; 
    }
    
    /**
    * Returns a new ComplexNumber number that is
    * the negative of <em>this</em>. Note: the
    * original ComplexNumber is <b>NOT</b>
    * modified.
    * @return -this
    */
    public ComplexNumber negate() {
        // Creates a new complex number and copies over the real and imginary 
        // number but multiplying by (-1) to negate the signs.
        return new ComplexNumber(this.real_Num*(-1), this.imaginary_Num*(-1)); 
    }
    
    /**
    * Returns a new ComplexNumber that is the
    * sum of <em>this</em> and <em>z</em>.
    * Note: the original ComplexNumber is
    * <b>NOT</b> modified.
    * @param z
    * @return this + z
    */
    public ComplexNumber add(ComplexNumber z) {
        // Creates a new complex Number, takes the real and imaginary numbers of 
        // the provided complex number and adds it with the given complex number
        return new ComplexNumber(this.real_Num + z.real_Num, this.imaginary_Num + z.imaginary_Num);
    }
    
    /**
    * Returns a new ComplexNumber that is the
    * difference of <em>this</em> and <em>z</em>.
    * * Note: the original ComplexNumber is
    * <b>NOT</b> modified.
    * @param z
    * @return this + z
    */
    public ComplexNumber subtract(ComplexNumber z) {
        // Creates a new complex Number, negating the given complex number
        // and adding it to the orginial number
        return this.add(z.negate());
    }
    
    /**
    * Returns a new ComplexNumber that is the
    * product of <em>this</em> and <em>z</em>.
    * Note: the original ComplexNumber is
    * <b>NOT</b> modified.
    * @param z
    * @return this * z
    */
    public ComplexNumber multiply(ComplexNumber z) {
        // Creates a new complex number and using this forumla (a + ib) (c + id) = 
        // (ac - bd) + i(ad + bc) muliplies the two complex numbers
        return new ComplexNumber(this.real_Num*z.real_Num - this.imaginary_Num*z.imaginary_Num,
                                 this.real_Num*z.imaginary_Num + this.imaginary_Num*z.real_Num);
    }
    
    /**
    * Returns a new ComplexNumber that is
    * the reciprocal of <em>this</em>.
    * Note: the original ComplexNumber is
    * <b>NOT</b> modified.
    * @return 1.0 / this
    */
    public ComplexNumber reciprocal() {
        // Creates a new complex number(z = x + iy) and using this forumla 1/z = (x/(x^2 + y^2)) +
        // (-y/(x^2 + y^2)) and recipacates the complex number
        return new ComplexNumber(this.real_Num/(this.real_Num*this.real_Num + this.imaginary_Num*this.imaginary_Num), 
                                (-1)*this.imaginary_Num/(this.real_Num*this.real_Num + this.imaginary_Num*this.imaginary_Num));
    }
    
    /**
    * Returns a new ComplexNumber that is
    * <em>this</em> divided by <em>z</em>.
    * Note: the original ComplexNumber is
    * <b>NOT</b> modified.
    * @param z
    * @return this / z
    */
    public ComplexNumber divide(ComplexNumber z) {
        // taking the reciprocal of the given number than mulyiplying it by 
        // the complex number already given 
        return this.multiply(z.reciprocal());
    }
    
    /**
    * Returns a String representation of
    * <em>this</em> in the format:
    * <pre>
    * real +-(optional) i imaginary
    * </pre>
    * If the imaginary part is zero, only the
    * real part is converted to a String.
    * A "+" or "-" is placed between the real
    * and imaginary parts depending on the
    * the sign of the imagrinary part.
    * <p>
    * Examples:
    * <pre>
    * ..println(new ComplexNumber(0,0); -> "0.0"
    * ComplexNumber
    Page 4 of 5
    * ..println(new ComplexNumber(1,1); -> "1.0 + i1.0"
    * ..println(new ComplexNumber(1,-1); -> "1.0 - i1.0"
    * </pre>
    * @return the String representation.
    */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE!
        String str = "" + this.getReal();
        if (this.getImaginary() == 0.0) {
            return str;
        }
        if (this.getImaginary() > 0) {
            return str + " + i" + this.getImaginary();
        } else {
            return str + " - i" + -this.getImaginary();
        }
    }
}