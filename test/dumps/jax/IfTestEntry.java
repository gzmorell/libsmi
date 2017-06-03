/*
 * This Java file has been generated by smidump 0.4.5. Do not edit!
 * It is intended to be used within a Java AgentX sub-agent environment.
 *
 * $Id: IfTestEntry.java 1458 2006-05-29 16:21:11Z strauss $
 */

/**
    This class represents a Java AgentX (JAX) implementation of
    the table row ifTestEntry defined in IF-MIB.

    @version 1
    @author  smidump 0.4.5
    @see     AgentXTable, AgentXEntry
 */

import jax.AgentXOID;
import jax.AgentXSetPhase;
import jax.AgentXResponsePDU;
import jax.AgentXEntry;

public class IfTestEntry extends AgentXEntry
{

    protected int ifTestId = 0;
    protected int undo_ifTestId = 0;
    protected int ifTestStatus = 0;
    protected int undo_ifTestStatus = 0;
    protected AgentXOID ifTestType = new AgentXOID();
    protected AgentXOID undo_ifTestType = new AgentXOID();
    protected int ifTestResult = 0;
    protected AgentXOID ifTestCode = new AgentXOID();
    protected byte[] ifTestOwner = new byte[0];
    protected byte[] undo_ifTestOwner = new byte[0];

    public IfTestEntry()
    {

    }

    public int get_ifTestId()
    {
        return ifTestId;
    }

    public int set_ifTestId(AgentXSetPhase phase, int value)
    {
        switch (phase.getPhase()) {
        case AgentXSetPhase.TEST_SET:
            break;
        case AgentXSetPhase.COMMIT:
            undo_ifTestId = ifTestId;
            ifTestId = value;
            break;
        case AgentXSetPhase.UNDO:
            ifTestId = undo_ifTestId;
            break;
        case AgentXSetPhase.CLEANUP:
            break;
        default:
            return AgentXResponsePDU.PROCESSING_ERROR;
        }
        return AgentXResponsePDU.NO_ERROR;
    }
    public int get_ifTestStatus()
    {
        return ifTestStatus;
    }

    public int set_ifTestStatus(AgentXSetPhase phase, int value)
    {
        switch (phase.getPhase()) {
        case AgentXSetPhase.TEST_SET:
            break;
        case AgentXSetPhase.COMMIT:
            undo_ifTestStatus = ifTestStatus;
            ifTestStatus = value;
            break;
        case AgentXSetPhase.UNDO:
            ifTestStatus = undo_ifTestStatus;
            break;
        case AgentXSetPhase.CLEANUP:
            break;
        default:
            return AgentXResponsePDU.PROCESSING_ERROR;
        }
        return AgentXResponsePDU.NO_ERROR;
    }
    public AgentXOID get_ifTestType()
    {
        return ifTestType;
    }

    public int set_ifTestType(AgentXSetPhase phase, AgentXOID value)
    {
        switch (phase.getPhase()) {
        case AgentXSetPhase.TEST_SET:
            break;
        case AgentXSetPhase.COMMIT:
            undo_ifTestType = ifTestType;
            ifTestType = value;
            break;
        case AgentXSetPhase.UNDO:
            ifTestType = undo_ifTestType;
            break;
        case AgentXSetPhase.CLEANUP:
            break;
        default:
            return AgentXResponsePDU.PROCESSING_ERROR;
        }
        return AgentXResponsePDU.NO_ERROR;
    }
    public int get_ifTestResult()
    {
        return ifTestResult;
    }

    public AgentXOID get_ifTestCode()
    {
        return ifTestCode;
    }

    public byte[] get_ifTestOwner()
    {
        return ifTestOwner;
    }

    public int set_ifTestOwner(AgentXSetPhase phase, byte[] value)
    {
        switch (phase.getPhase()) {
        case AgentXSetPhase.TEST_SET:
            break;
        case AgentXSetPhase.COMMIT:
            undo_ifTestOwner = ifTestOwner;
            ifTestOwner = new byte[value.length];
            for(int i = 0; i < value.length; i++)
                ifTestOwner[i] = value[i];
            break;
        case AgentXSetPhase.UNDO:
            ifTestOwner = undo_ifTestOwner;
            break;
        case AgentXSetPhase.CLEANUP:
            undo_ifTestOwner = null;
            break;
        default:
            return AgentXResponsePDU.PROCESSING_ERROR;
        }
        return AgentXResponsePDU.NO_ERROR;
    }
}

