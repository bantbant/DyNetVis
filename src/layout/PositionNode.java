/* ***** BEGIN LICENSE BLOCK *****
 *
 * Copyright (c) 2014-2019 Bruno Augusto Nassif Travencolo.
 * All Rights Reserved.
 *
 * This file is part of DyNetVis Project (DyNetVis).
 *
 * How to cite this software:
 *  
@inproceedings{Linhares:2017:DSV:3019612.3019686,
 author = {Linhares, Claudio D. G. and Traven\c{c}olo, Bruno A. N. and Paiva, Jose Gustavo S. and Rocha, Luis E. C.},
 title = {DyNetVis: A System for Visualization of Dynamic Networks},
 booktitle = {Proceedings of the Symposium on Applied Computing},
 series = {SAC '17},
 year = {2017},
 isbn = {978-1-4503-4486-9},
 location = {Marrakech, Morocco},
 pages = {187--194},
 numpages = {8},
 url = {http://doi.acm.org/10.1145/3019612.3019686},
 doi = {10.1145/3019612.3019686},
 acmid = {3019686},
 publisher = {ACM},
 address = {New York, NY, USA},
 keywords = {complex networks, dynamic graph visualization, dynamic networks, recurrent neighbors, temporal activity map},
} 
 *  
 * DyNetVis is free software: you can redistribute it and/or modify it under 
 * the terms of the GNU General Public License as published by the Free 
 * Software Foundation, either version 3 of the License, or (at your option) 
 * any later version.
 *
 * DyNetVis is distributed in the hope that it will be useful, but WITHOUT 
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY 
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License 
 * for more details.
 *
 * This code was developed by members of Lab of Complex Network Visualization at 
 * Federal University of Uberlândia, Brazil - (https://sites.google.com/view/dynetvis/team?authuser=0). 
 * The initial developer of the original code is Claudio D. G. Linhares <claudiodgl@gmail.com>.
 *
 * Contributor(s): Jean R. Ponciano -- jeanrobertop@gmail.com, Luis E. C. Rocha -- luis.rocha@ugent.be, 
 * José Gustavo S. Paiva -- gustavo@ufu.br, Bruno A. N. Travençolo -- travencolo@gmail.com
 *
 * You should have received a copy of the GNU General Public License along 
 * with DyNetVis. If not, see <http://www.gnu.org/licenses/>.
 *
 * ***** END LICENSE BLOCK ***** */

package layout;

/**
 *
 * @author Claudio Linhares
 */
public class PositionNode{
    private float x;
    private float y;
    private int time;

    public PositionNode(float x, float y, int time){
        this.x = x;
        this.y = y;
        this.time = time;
    }

    /**
     * @return the x
     */
    public float getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public float getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * @return the time
     */
    public int getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(int time) {
        this.time = time;
    }

}
