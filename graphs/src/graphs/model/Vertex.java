package graphs.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javafx.geometry.Point2D;

public class Vertex {
	private Point2D point;
	private List<Edge> connectedEdges;

	public Vertex(Point2D point, Collection<Edge> connectedEdges) {
		super();
		this.point = point;
		this.connectedEdges = new ArrayList<>(connectedEdges);
	}

	public Point2D getPoint() {
		return point;
	}

	public List<Edge> getConnectedEdges() {
		return new ArrayList<Edge>(connectedEdges);
	}
}
