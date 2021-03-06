/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import java.util.LinkedHashSet;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.example.mydsl.projectDSL.Controller;
import org.xtext.example.mydsl.projectDSL.Div;
import org.xtext.example.mydsl.projectDSL.Endpoint;
import org.xtext.example.mydsl.projectDSL.Entity;
import org.xtext.example.mydsl.projectDSL.Expression;
import org.xtext.example.mydsl.projectDSL.Minus;
import org.xtext.example.mydsl.projectDSL.Mult;
import org.xtext.example.mydsl.projectDSL.Num;
import org.xtext.example.mydsl.projectDSL.Param;
import org.xtext.example.mydsl.projectDSL.Parameter;
import org.xtext.example.mydsl.projectDSL.Plus;
import org.xtext.example.mydsl.projectDSL.RestAPI;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class ProjectDSLGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final RestAPI modelInstance = Iterators.<RestAPI>filter(resource.getAllContents(), RestAPI.class).next();
    final Iterable<Entity> entities = Iterables.<Entity>filter(modelInstance.getDeclarations(), Entity.class);
    final Iterable<Controller> controllers = Iterables.<Controller>filter(modelInstance.getDeclarations(), Controller.class);
    this.generateApp(fsa, entities);
    final Consumer<Controller> _function = (Controller it) -> {
      this.generateControllers(it, fsa);
    };
    Iterables.<Controller>filter(modelInstance.getDeclarations(), Controller.class).forEach(_function);
  }
  
  public CharSequence generateMath(final Parameter p) {
    CharSequence _xifexpression = null;
    if (((p.getOp() != null) && (p.getRight() != null))) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("if(");
      String _generateExp = ProjectDSLGenerator.generateExp(p.getLeft().getExp());
      _builder.append(_generateExp);
      _builder.append(" ");
      String _op = p.getOp();
      _builder.append(_op);
      _builder.append(" ");
      String _generateExp_1 = ProjectDSLGenerator.generateExp(p.getRight().getExp());
      _builder.append(_generateExp_1);
      _builder.append(")");
      _xifexpression = _builder;
    }
    return _xifexpression;
  }
  
  public static String generateExp(final Expression exp) {
    String _switchResult = null;
    boolean _matched = false;
    if (exp instanceof Plus) {
      _matched=true;
      String _generateExp = ProjectDSLGenerator.generateExp(((Plus)exp).getLeft());
      String _plus = ("(" + _generateExp);
      String _plus_1 = (_plus + "+");
      String _generateExp_1 = ProjectDSLGenerator.generateExp(((Plus)exp).getRight());
      String _plus_2 = (_plus_1 + _generateExp_1);
      _switchResult = (_plus_2 + ")");
    }
    if (!_matched) {
      if (exp instanceof Minus) {
        _matched=true;
        String _generateExp = ProjectDSLGenerator.generateExp(((Minus)exp).getLeft());
        String _plus = ("(" + _generateExp);
        String _plus_1 = (_plus + "-");
        String _generateExp_1 = ProjectDSLGenerator.generateExp(((Minus)exp).getRight());
        String _plus_2 = (_plus_1 + _generateExp_1);
        _switchResult = (_plus_2 + ")");
      }
    }
    if (!_matched) {
      if (exp instanceof Mult) {
        _matched=true;
        String _generateExp = ProjectDSLGenerator.generateExp(((Mult)exp).getLeft());
        String _plus = ("(" + _generateExp);
        String _plus_1 = (_plus + "*");
        String _generateExp_1 = ProjectDSLGenerator.generateExp(((Mult)exp).getRight());
        String _plus_2 = (_plus_1 + _generateExp_1);
        _switchResult = (_plus_2 + ")");
      }
    }
    if (!_matched) {
      if (exp instanceof Div) {
        _matched=true;
        String _generateExp = ProjectDSLGenerator.generateExp(((Div)exp).getLeft());
        String _plus = ("(" + _generateExp);
        String _plus_1 = (_plus + "/");
        String _generateExp_1 = ProjectDSLGenerator.generateExp(((Div)exp).getRight());
        String _plus_2 = (_plus_1 + _generateExp_1);
        _switchResult = (_plus_2 + ")");
      }
    }
    if (!_matched) {
      if (exp instanceof Num) {
        _matched=true;
        _switchResult = Integer.toString(((Num)exp).getValue());
      }
    }
    if (!_matched) {
      if (exp instanceof Param) {
        _matched=true;
        String _name = ((Param)exp).getValue().getName();
        _switchResult = ("req.body." + _name);
      }
    }
    if (!_matched) {
      throw new Error("Incorrect expression!");
    }
    return _switchResult;
  }
  
  public void generateApp(final IFileSystemAccess2 access1, final Iterable<Entity> entities) {
    access1.generateFile("app.js", this.generateCore(entities));
  }
  
  public void generateControllers(final Controller controller, final IFileSystemAccess2 access2) {
    String _name = controller.getName();
    String _plus = (_name + ".js");
    access2.generateFile(_plus, this.generateController(controller));
  }
  
  public CharSequence generateController(final Controller controller) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("var mongoose = require(\'mongoose\');");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("var ");
    String _name = controller.getName();
    _builder.append(_name, "\t");
    _builder.append(" = {");
    _builder.newLineIfNotEmpty();
    {
      EList<Entity> _base = controller.getBase();
      for(final Entity base : _base) {
        _builder.append("\t\t");
        _builder.append("create");
        String _firstUpper = StringExtensions.toFirstUpper(base.getName());
        _builder.append(_firstUpper, "\t\t");
        _builder.append(": function(");
        String _firstUpper_1 = StringExtensions.toFirstUpper(base.getName());
        _builder.append(_firstUpper_1, "\t\t");
        _builder.append(", req, res) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        String _firstUpper_2 = StringExtensions.toFirstUpper(base.getName());
        _builder.append(_firstUpper_2, "\t\t\t");
        _builder.append(".collection.insertOne(new ");
        String _firstUpper_3 = StringExtensions.toFirstUpper(base.getName());
        _builder.append(_firstUpper_3, "\t\t\t");
        _builder.append("({");
        _builder.newLineIfNotEmpty();
        {
          Iterable<Parameter> _xifexpression = null;
          Entity _parent = base.getParent();
          boolean _tripleNotEquals = (_parent != null);
          if (_tripleNotEquals) {
            EList<Parameter> _parameters = base.getParent().getParameters();
            EList<Parameter> _parameters_1 = base.getParameters();
            _xifexpression = Iterables.<Parameter>concat(_parameters, _parameters_1);
          } else {
            _xifexpression = base.getParameters();
          }
          for(final Parameter bp : _xifexpression) {
            _builder.append("\t\t");
            _builder.append("\t\t");
            String _name_1 = bp.getName();
            _builder.append(_name_1, "\t\t\t\t");
            _builder.append(":req.body.");
            String _lowerCase = bp.getName().toLowerCase();
            _builder.append(_lowerCase, "\t\t\t\t");
            _builder.append(",");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t");
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("})");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append(");");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("},");
        _builder.newLine();
        _builder.append("\t        ");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("delete");
        String _firstUpper_4 = StringExtensions.toFirstUpper(base.getName());
        _builder.append(_firstUpper_4, "\t\t");
        _builder.append(": function(");
        String _firstUpper_5 = StringExtensions.toFirstUpper(base.getName());
        _builder.append(_firstUpper_5, "\t\t");
        _builder.append(", req, res) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t        ");
        String _firstUpper_6 = StringExtensions.toFirstUpper(base.getName());
        _builder.append(_firstUpper_6, "\t        ");
        _builder.append(".collection.deleteOne(req.body.id, function(err, result){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t        \t");
        _builder.append("if(err) { res.send(\"Error!\")");
        _builder.newLine();
        _builder.append("\t        \t");
        _builder.append("} else { res.send(\"Success!\") }");
        _builder.newLine();
        _builder.append("\t        ");
        _builder.append("})");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("};");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("},");
        _builder.newLine();
      }
    }
    {
      EList<Endpoint> _endpoint = controller.getEndpoint();
      for(final Endpoint e : _endpoint) {
        {
          EList<Entity> _base_1 = controller.getBase();
          for(final Entity b : _base_1) {
            {
              Iterable<Parameter> _xifexpression_1 = null;
              Entity _parent_1 = b.getParent();
              boolean _tripleNotEquals_1 = (_parent_1 != null);
              if (_tripleNotEquals_1) {
                EList<Parameter> _parameters_2 = b.getParameters();
                EList<Parameter> _parameters_3 = b.getParent().getParameters();
                _xifexpression_1 = Iterables.<Parameter>concat(_parameters_2, _parameters_3);
              } else {
                _xifexpression_1 = b.getParameters();
              }
              for(final Parameter p : _xifexpression_1) {
                {
                  String _name_2 = p.getName();
                  String _name_3 = e.getEndpoint().getName();
                  boolean _equals = Objects.equal(_name_2, _name_3);
                  if (_equals) {
                    {
                      EList<String> _type = p.getType();
                      for(final String t : _type) {
                        _builder.append("\t\t");
                        CharSequence _switchResult = null;
                        String _string = t.toString();
                        if (_string != null) {
                          switch (_string) {
                            case "R":
                              StringConcatenation _builder_1 = new StringConcatenation();
                              _builder_1.append("get");
                              String _name_4 = p.getName();
                              _builder_1.append(_name_4);
                              _builder_1.append(": function(");
                              String _firstUpper_7 = StringExtensions.toFirstUpper(b.getName());
                              _builder_1.append(_firstUpper_7);
                              _builder_1.append(", req, res) {");
                              _builder_1.newLineIfNotEmpty();
                              _builder_1.append("\t");
                              CharSequence _generateMath = this.generateMath(p);
                              _builder_1.append(_generateMath, "\t");
                              _builder_1.append("{");
                              _builder_1.newLineIfNotEmpty();
                              _builder_1.append("\t");
                              String _firstUpper_8 = StringExtensions.toFirstUpper(b.getName());
                              _builder_1.append(_firstUpper_8, "\t");
                              _builder_1.append(".collection.findOne({");
                              _builder_1.newLineIfNotEmpty();
                              _builder_1.append("\t\t");
                              _builder_1.append("Id: req.params.id");
                              _builder_1.newLine();
                              _builder_1.append("\t");
                              _builder_1.append("}, function(err, result){");
                              _builder_1.newLine();
                              _builder_1.append("\t\t");
                              _builder_1.append("if(err) {");
                              _builder_1.newLine();
                              _builder_1.append("\t\t\t\t");
                              _builder_1.append("res.send(\"There was an error!\");");
                              _builder_1.newLine();
                              _builder_1.append("\t\t");
                              _builder_1.append("} else {");
                              _builder_1.newLine();
                              _builder_1.append("\t\t\t\t");
                              _builder_1.append("res.send(\"Success!\");");
                              _builder_1.newLine();
                              _builder_1.append("\t");
                              _builder_1.append("});");
                              _builder_1.newLine();
                              _builder_1.append("}},");
                              _switchResult = _builder_1;
                              break;
                            case "U":
                              StringConcatenation _builder_2 = new StringConcatenation();
                              _builder_2.append("put");
                              String _name_5 = p.getName();
                              _builder_2.append(_name_5);
                              _builder_2.append(": function(");
                              String _firstUpper_9 = StringExtensions.toFirstUpper(b.getName());
                              _builder_2.append(_firstUpper_9);
                              _builder_2.append(", req, res) {");
                              _builder_2.newLineIfNotEmpty();
                              _builder_2.append("\t");
                              CharSequence _generateMath_1 = this.generateMath(p);
                              _builder_2.append(_generateMath_1, "\t");
                              _builder_2.append("{");
                              _builder_2.newLineIfNotEmpty();
                              _builder_2.append("\t");
                              String _firstUpper_10 = StringExtensions.toFirstUpper(b.getName());
                              _builder_2.append(_firstUpper_10, "\t");
                              _builder_2.append(".collection.findOneAndUpdate({");
                              _builder_2.newLineIfNotEmpty();
                              _builder_2.append("\t\t");
                              String _name_6 = p.getName();
                              _builder_2.append(_name_6, "\t\t");
                              _builder_2.append(":req.body.");
                              String _lowerCase_1 = p.getName().toLowerCase();
                              _builder_2.append(_lowerCase_1, "\t\t");
                              _builder_2.newLineIfNotEmpty();
                              _builder_2.append("\t");
                              _builder_2.append("}, {");
                              _builder_2.newLine();
                              _builder_2.append("\t\t");
                              _builder_2.append("$set: {");
                              _builder_2.newLine();
                              _builder_2.append("\t\t");
                              String _name_7 = p.getName();
                              _builder_2.append(_name_7, "\t\t");
                              _builder_2.append(":req.body.value");
                              _builder_2.newLineIfNotEmpty();
                              _builder_2.append("\t\t");
                              _builder_2.append("}");
                              _builder_2.newLine();
                              _builder_2.append("\t");
                              _builder_2.append("});");
                              _builder_2.newLine();
                              _builder_2.append("}},");
                              _switchResult = _builder_2;
                              break;
                          }
                        }
                        _builder.append(_switchResult, "\t\t");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    _builder.append("module.exports = ");
    String _name_8 = controller.getName();
    _builder.append(_name_8);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateCore(final Iterable<Entity> entities) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("const express = require(\'express\')");
    _builder.newLine();
    _builder.append("const app = express()");
    _builder.newLine();
    _builder.append("const port = 3000\t");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// Controllers");
    _builder.newLine();
    LinkedHashSet<String> controllerNames = new LinkedHashSet<String>();
    _builder.newLineIfNotEmpty();
    {
      for(final Entity e : entities) {
        {
          Controller _ctrlr = e.getCtrlr();
          boolean _tripleNotEquals = (_ctrlr != null);
          if (_tripleNotEquals) {
            {
              boolean _add = controllerNames.add(e.getCtrlr().getName());
              if (_add) {
                _builder.append("var ");
                String _firstLower = StringExtensions.toFirstLower(e.getCtrlr().getName());
                _builder.append(_firstLower);
                _builder.append(" = requires(\'./");
                String _firstUpper = StringExtensions.toFirstUpper(e.getCtrlr().getName());
                _builder.append(_firstUpper);
                _builder.append(".js\');");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("// Mongoose Schemas");
    _builder.newLine();
    _builder.newLine();
    {
      for(final Entity e_1 : entities) {
        {
          Controller _ctrlr_1 = e_1.getCtrlr();
          boolean _tripleNotEquals_1 = (_ctrlr_1 != null);
          if (_tripleNotEquals_1) {
            _builder.append("var ");
            String _firstLower_1 = StringExtensions.toFirstLower(e_1.getName());
            _builder.append(_firstLower_1);
            _builder.append("Schema = new mongoose.Schema({");
            _builder.newLineIfNotEmpty();
            {
              Iterable<Parameter> _xifexpression = null;
              Entity _parent = e_1.getParent();
              boolean _tripleNotEquals_2 = (_parent != null);
              if (_tripleNotEquals_2) {
                EList<Parameter> _parameters = e_1.getParent().getParameters();
                EList<Parameter> _parameters_1 = e_1.getParameters();
                _xifexpression = Iterables.<Parameter>concat(_parameters, _parameters_1);
              } else {
                _xifexpression = e_1.getParameters();
              }
              for(final Parameter p : _xifexpression) {
                _builder.append("\t");
                String _name = p.getName();
                _builder.append(_name, "\t");
                _builder.append(": ");
                String _dataType = p.getDataType();
                _builder.append(_dataType, "\t");
                _builder.append(",");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("}, {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("collection: \'");
            String _firstLower_2 = StringExtensions.toFirstLower(e_1.getName());
            _builder.append(_firstLower_2, "\t");
            _builder.append("s\'");
            _builder.newLineIfNotEmpty();
            _builder.append("});");
            _builder.newLine();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("// Mongoose Models");
    _builder.newLine();
    _builder.newLine();
    {
      for(final Entity e_2 : entities) {
        {
          Controller _ctrlr_2 = e_2.getCtrlr();
          boolean _tripleNotEquals_3 = (_ctrlr_2 != null);
          if (_tripleNotEquals_3) {
            _builder.append("var ");
            String _firstUpper_1 = StringExtensions.toFirstUpper(e_2.getName());
            _builder.append(_firstUpper_1);
            _builder.append(" = mongoose.model(\'");
            String _firstUpper_2 = StringExtensions.toFirstUpper(e_2.getName());
            _builder.append(_firstUpper_2);
            _builder.append("\', ");
            String _firstLower_3 = StringExtensions.toFirstLower(e_2.getName());
            _builder.append(_firstLower_3);
            _builder.append("Schema);");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("//Endpoints");
    _builder.newLine();
    _builder.newLine();
    {
      for(final Entity e_3 : entities) {
        {
          Controller _ctrlr_3 = e_3.getCtrlr();
          boolean _tripleNotEquals_4 = (_ctrlr_3 != null);
          if (_tripleNotEquals_4) {
            _builder.append("// ");
            String _firstUpper_3 = StringExtensions.toFirstUpper(e_3.getName());
            _builder.append(_firstUpper_3);
            _builder.newLineIfNotEmpty();
            {
              EList<Endpoint> _endpoint = e_3.getCtrlr().getEndpoint();
              for(final Endpoint p_1 : _endpoint) {
                {
                  EList<String> _type = p_1.getEndpoint().getType();
                  for(final String t : _type) {
                    CharSequence _switchResult = null;
                    String _string = t.toString();
                    if (_string != null) {
                      switch (_string) {
                        case "R":
                          StringConcatenation _builder_1 = new StringConcatenation();
                          _builder_1.append("app.get(\'/get");
                          String _firstUpper_4 = StringExtensions.toFirstUpper(e_3.getName());
                          _builder_1.append(_firstUpper_4);
                          String _firstUpper_5 = StringExtensions.toFirstUpper(p_1.getEndpoint().getName());
                          _builder_1.append(_firstUpper_5);
                          _builder_1.append("\', function (req, res)  {");
                          _builder_1.newLineIfNotEmpty();
                          _builder_1.append("\t");
                          String _firstUpper_6 = StringExtensions.toFirstUpper(e_3.getName());
                          _builder_1.append(_firstUpper_6, "\t");
                          _builder_1.append("Controller.get");
                          String _name_1 = p_1.getEndpoint().getName();
                          _builder_1.append(_name_1, "\t");
                          _builder_1.append("(");
                          String _firstUpper_7 = StringExtensions.toFirstUpper(e_3.getName());
                          _builder_1.append(_firstUpper_7, "\t");
                          _builder_1.append(", req, res);");
                          _builder_1.newLineIfNotEmpty();
                          _builder_1.append("});");
                          _switchResult = _builder_1;
                          break;
                        case "U":
                          StringConcatenation _builder_2 = new StringConcatenation();
                          _builder_2.append("app.put(\'/put");
                          String _firstUpper_8 = StringExtensions.toFirstUpper(e_3.getName());
                          _builder_2.append(_firstUpper_8);
                          String _firstUpper_9 = StringExtensions.toFirstUpper(p_1.getEndpoint().getName());
                          _builder_2.append(_firstUpper_9);
                          _builder_2.append("\', function (req, res)  {");
                          _builder_2.newLineIfNotEmpty();
                          _builder_2.append("\t");
                          String _firstUpper_10 = StringExtensions.toFirstUpper(e_3.getName());
                          _builder_2.append(_firstUpper_10, "\t");
                          _builder_2.append("Controller.put");
                          String _name_2 = p_1.getEndpoint().getName();
                          _builder_2.append(_name_2, "\t");
                          _builder_2.append("(");
                          String _firstUpper_11 = StringExtensions.toFirstUpper(e_3.getName());
                          _builder_2.append(_firstUpper_11, "\t");
                          _builder_2.append(", req, res);");
                          _builder_2.newLineIfNotEmpty();
                          _builder_2.append("});");
                          _switchResult = _builder_2;
                          break;
                      }
                    }
                    _builder.append(_switchResult);
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public void display(final EObject model) {
    try {
      final XMLResourceImpl res = new XMLResourceImpl();
      res.getContents().add(EcoreUtil.<EObject>copy(model));
      System.out.println("Dump of model:");
      res.save(System.out, null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
