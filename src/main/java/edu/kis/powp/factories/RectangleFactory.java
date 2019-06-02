package edu.kis.powp.factories;

import java.util.ArrayList;
import java.util.List;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.Job2dDriver;

public class RectangleFactory {

	public static DriverCommand figureScript(Job2dDriver driver) {
        List<DriverCommand> commands = new ArrayList<>();
        commands.add(new SetPositionCommand( driver ).setX( -100 ).setY( -100 ));
        commands.add(new OperateToCommand( driver ).setX( 50 ).setY( -100 ));
        commands.add(new OperateToCommand( driver ).setX( 50 ).setY( 0));
        commands.add(new OperateToCommand( driver ).setX( -100 ).setY( 0));
        commands.add(new OperateToCommand( driver ).setX( -100 ).setY( -100));
        
        return new ComplexCommand( commands );
	}
}
