package de.bsm.euro2dollar.de.gui.presenter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.*;

import de.bsm.euro2dollar.de.model.IEuro2DollarRechner;
import de.bsm.euro2dollar.gui.IEuro2DollarRechnerView;

@RunWith(MockitoJUnitRunner.class)
public class Euro2DollarPresenterTest {
	@Mock
	private IEuro2DollarRechner modelMock;

	@Mock
	private IEuro2DollarRechnerView viewMock;
	@InjectMocks
	private Euro2DollarPresenter underTest;
	
	
	
	

	
	
}
