

import ij.process.Blitter;
import ij.process.ImageProcessor;

public class MinProjector_Hackathon {

	private ImageProcessor ip = null;

	public void reset() {
		ip = null;
	}

	public void add(ImageProcessor ip) {
		if(this.ip == null)
			this.ip = ip;
		else
			this.ip.copyBits(ip, 0, 0, Blitter.MIN);
	}
	
	
	public void add_ROI(ImageProcessor newimage) {
		if(this.ip == null)
			this.ip = newimage;
		else
			this.ip.copyBits(newimage, 0, 0, Blitter.MIN);
	}

	public ImageProcessor getProjection() {
		return ip;
	}
}
