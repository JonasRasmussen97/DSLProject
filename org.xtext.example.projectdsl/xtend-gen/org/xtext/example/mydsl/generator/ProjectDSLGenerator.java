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
import org.xtext.example.mydsl.projectDSL.ParentEntity;
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
    final Iterable<ParentEntity> parentEntities = Iterables.<ParentEntity>filter(modelInstance.getDeclarations(), ParentEntity.class);
    final Iterable<Controller> controllers = Iterables.<Controller>filter(modelInstance.getDeclarations(), Controller.class);
    this.generateApp(fsa, entities, controllers);
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
  
  public void generateApp(final IFileSystemAccess2 access1, final Iterable<Entity> entities, final Iterable<Controller> controllers) {
    access1.generateFile("app.js", this.generateAppJs(entities, controllers));
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
    _builder.newLine();
    _builder.append("\t");
    _builder.append("var ");
    String _name = controller.getName();
    _builder.append(_name, "\t");
    _builder.append(" = {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    {
      EList<Entity> _base = controller.getBase();
      for(final Entity base : _base) {
        _builder.append("\t\t");
        _builder.append("// ");
        String _name_1 = base.getName();
        _builder.append(_name_1, "\t\t");
        _builder.newLineIfNotEmpty();
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
          EList<Parameter> _parameters = base.getParameters();
          for(final Parameter bp : _parameters) {
            _builder.append("\t\t");
            _builder.append("\t\t");
            String _name_2 = bp.getName();
            _builder.append(_name_2, "\t\t\t\t");
            _builder.append(":req.body.");
            String _lowerCase = bp.getName().toLowerCase();
            _builder.append(_lowerCase, "\t\t\t\t");
            _builder.append(",");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t");
        _builder.append("\t\t");
        _builder.append("})");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append(");");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("},");
        _builder.newLine();
        _builder.append("\t\t");
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
        _builder.append("\t        \t");
        _builder.append("})");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("};");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("},");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.newLine();
        {
          ParentEntity _parent = base.getParent();
          boolean _tripleNotEquals = (_parent != null);
          if (_tripleNotEquals) {
            {
              EList<Parameter> _parameters_1 = base.getParent().getParameters();
              for(final Parameter p : _parameters_1) {
                {
                  EList<Endpoint> _endpoint = controller.getEndpoint();
                  for(final Endpoint end : _endpoint) {
                    {
                      EList<String> _type = p.getType();
                      for(final String t : _type) {
                        CharSequence _switchResult = null;
                        String _string = t.toString();
                        if (_string != null) {
                          switch (_string) {
                            case "R":
                              StringConcatenation _builder_1 = new StringConcatenation();
                              _builder_1.append("\t\t");
                              _builder_1.append("get");
                              String _name_3 = p.getName();
                              _builder_1.append(_name_3, "\t\t");
                              _builder_1.append(": function(");
                              String _firstUpper_7 = StringExtensions.toFirstUpper(base.getName());
                              _builder_1.append(_firstUpper_7, "\t\t");
                              _builder_1.append(", req, res) {");
                              _builder_1.newLineIfNotEmpty();
                              _builder_1.append("\t\t\t");
                              CharSequence _generateMath = this.generateMath(p);
                              _builder_1.append(_generateMath, "\t\t\t");
                              _builder_1.append("{");
                              _builder_1.newLineIfNotEmpty();
                              _builder_1.append("\t\t\t\t");
                              String _firstUpper_8 = StringExtensions.toFirstUpper(base.getName());
                              _builder_1.append(_firstUpper_8, "\t\t\t\t");
                              _builder_1.append(".collection.findOne({");
                              _builder_1.newLineIfNotEmpty();
                              _builder_1.append("\t\t\t");
                              _builder_1.append("Id: req.params.id");
                              _builder_1.newLine();
                              _builder_1.append("\t\t\t\t");
                              _builder_1.append("}, function(err, result){");
                              _builder_1.newLine();
                              _builder_1.append("\t\t\t\t    ");
                              _builder_1.append("if(err) {");
                              _builder_1.newLine();
                              _builder_1.append("\t\t\t\t    \t");
                              _builder_1.append("res.send(\"There was an error!\");");
                              _builder_1.newLine();
                              _builder_1.append("\t\t\t\t    ");
                              _builder_1.append("} else {");
                              _builder_1.newLine();
                              _builder_1.append("\t\t\t\t    \t");
                              _builder_1.append("res.send(\"Success!\");");
                              _builder_1.newLine();
                              _builder_1.append("\t\t\t\t   ");
                              _builder_1.append("});");
                              _builder_1.newLine();
                              _builder_1.append("\t\t\t\t");
                              _builder_1.append("}");
                              _builder_1.newLine();
                              _builder_1.append("\t\t\t");
                              _builder_1.append("},");
                              _switchResult = _builder_1;
                              break;
                            case "U":
                              StringConcatenation _builder_2 = new StringConcatenation();
                              _builder_2.append("\t\t");
                              _builder_2.append("put");
                              String _name_4 = p.getName();
                              _builder_2.append(_name_4, "\t\t");
                              _builder_2.append(": function(");
                              String _firstUpper_9 = StringExtensions.toFirstUpper(base.getName());
                              _builder_2.append(_firstUpper_9, "\t\t");
                              _builder_2.append(", req, res) {");
                              _builder_2.newLineIfNotEmpty();
                              _builder_2.append("\t\t\t");
                              CharSequence _generateMath_1 = this.generateMath(p);
                              _builder_2.append(_generateMath_1, "\t\t\t");
                              _builder_2.append("{");
                              _builder_2.newLineIfNotEmpty();
                              _builder_2.append("\t\t\t\t");
                              String _firstUpper_10 = StringExtensions.toFirstUpper(base.getName());
                              _builder_2.append(_firstUpper_10, "\t\t\t\t");
                              _builder_2.append(".collection.findOneAndUpdate({");
                              _builder_2.newLineIfNotEmpty();
                              _builder_2.append("\t\t\t\t ");
                              String _name_5 = p.getName();
                              _builder_2.append(_name_5, "\t\t\t\t ");
                              _builder_2.append(":req.body.");
                              String _lowerCase_1 = p.getName().toLowerCase();
                              _builder_2.append(_lowerCase_1, "\t\t\t\t ");
                              _builder_2.newLineIfNotEmpty();
                              _builder_2.append("\t\t\t\t");
                              _builder_2.append("}, {");
                              _builder_2.newLine();
                              _builder_2.append("\t\t\t\t   \t");
                              _builder_2.append("$set: {");
                              _builder_2.newLine();
                              _builder_2.append("\t\t\t\t    \t");
                              String _name_6 = p.getName();
                              _builder_2.append(_name_6, "\t\t\t\t    \t");
                              _builder_2.append(":req.body.value");
                              _builder_2.newLineIfNotEmpty();
                              _builder_2.append("\t\t\t\t    ");
                              _builder_2.append("}");
                              _builder_2.newLine();
                              _builder_2.append("\t\t\t\t   ");
                              _builder_2.append("});");
                              _builder_2.newLine();
                              _builder_2.append("\t\t\t\t");
                              _builder_2.append("}");
                              _builder_2.newLine();
                              _builder_2.append("\t\t\t");
                              _builder_2.append("},");
                              _switchResult = _builder_2;
                              break;
                          }
                        }
                        _builder.append(_switchResult);
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t");
                        _builder.newLine();
                      }
                    }
                  }
                }
              }
            }
          }
        }
        _builder.append("\t\t");
        _builder.newLine();
        {
          EList<Parameter> _parameters_2 = base.getParameters();
          for(final Parameter p_1 : _parameters_2) {
            {
              EList<Endpoint> _endpoint_1 = controller.getEndpoint();
              for(final Endpoint end_1 : _endpoint_1) {
                {
                  String _name_7 = p_1.getName();
                  String _name_8 = end_1.getEndpoint().getName();
                  boolean _equals = Objects.equal(_name_7, _name_8);
                  if (_equals) {
                    {
                      EList<String> _type_1 = p_1.getType();
                      for(final String t_1 : _type_1) {
                        CharSequence _switchResult_1 = null;
                        String _string_1 = t_1.toString();
                        if (_string_1 != null) {
                          switch (_string_1) {
                            case "R":
                              StringConcatenation _builder_3 = new StringConcatenation();
                              _builder_3.append("\t\t");
                              _builder_3.append("get");
                              String _name_9 = p_1.getName();
                              _builder_3.append(_name_9, "\t\t");
                              _builder_3.append(": function(");
                              String _firstUpper_11 = StringExtensions.toFirstUpper(base.getName());
                              _builder_3.append(_firstUpper_11, "\t\t");
                              _builder_3.append(", req, res) {");
                              _builder_3.newLineIfNotEmpty();
                              _builder_3.append("\t\t\t");
                              CharSequence _generateMath_2 = this.generateMath(p_1);
                              _builder_3.append(_generateMath_2, "\t\t\t");
                              _builder_3.append("{");
                              _builder_3.newLineIfNotEmpty();
                              _builder_3.append("\t\t\t\t");
                              String _firstUpper_12 = StringExtensions.toFirstUpper(base.getName());
                              _builder_3.append(_firstUpper_12, "\t\t\t\t");
                              _builder_3.append(".collection.findOne({");
                              _builder_3.newLineIfNotEmpty();
                              _builder_3.append("\t  \t \t");
                              _builder_3.append("Id: req.params.id");
                              _builder_3.newLine();
                              _builder_3.append("\t   \t\t");
                              _builder_3.append("}, function(err, result){");
                              _builder_3.newLine();
                              _builder_3.append("\t    \t\t\t");
                              _builder_3.append("if(err) {");
                              _builder_3.newLine();
                              _builder_3.append("\t    \t\t\t\t");
                              _builder_3.append("res.send(\"There was an error!\");");
                              _builder_3.newLine();
                              _builder_3.append("\t    \t\t\t");
                              _builder_3.append("} else {");
                              _builder_3.newLine();
                              _builder_3.append("\t    \t\t\t\t");
                              _builder_3.append("res.send(\"Success!\");");
                              _builder_3.newLine();
                              _builder_3.append("\t    \t\t");
                              _builder_3.append("});");
                              _builder_3.newLine();
                              _builder_3.append("\t\t\t");
                              _builder_3.append("}");
                              _builder_3.newLine();
                              _builder_3.append("\t\t");
                              _builder_3.append("},");
                              _switchResult_1 = _builder_3;
                              break;
                            case "U":
                              StringConcatenation _builder_4 = new StringConcatenation();
                              _builder_4.append("\t\t");
                              _builder_4.append("put");
                              String _name_10 = p_1.getName();
                              _builder_4.append(_name_10, "\t\t");
                              _builder_4.append(": function(");
                              String _firstUpper_13 = StringExtensions.toFirstUpper(base.getName());
                              _builder_4.append(_firstUpper_13, "\t\t");
                              _builder_4.append(", req, res) {");
                              _builder_4.newLineIfNotEmpty();
                              _builder_4.append("\t\t\t");
                              CharSequence _generateMath_3 = this.generateMath(p_1);
                              _builder_4.append(_generateMath_3, "\t\t\t");
                              _builder_4.append("{");
                              _builder_4.newLineIfNotEmpty();
                              _builder_4.append("\t\t\t\t");
                              String _firstUpper_14 = StringExtensions.toFirstUpper(base.getName());
                              _builder_4.append(_firstUpper_14, "\t\t\t\t");
                              _builder_4.append(".collection.findOneAndUpdate({");
                              _builder_4.newLineIfNotEmpty();
                              _builder_4.append("\t   \t\t\t ");
                              String _name_11 = p_1.getName();
                              _builder_4.append(_name_11, "\t   \t\t\t ");
                              _builder_4.append(":req.body.");
                              String _lowerCase_2 = p_1.getName().toLowerCase();
                              _builder_4.append(_lowerCase_2, "\t   \t\t\t ");
                              _builder_4.newLineIfNotEmpty();
                              _builder_4.append("\t    \t\t");
                              _builder_4.append("}, {");
                              _builder_4.newLine();
                              _builder_4.append("\t    \t\t\t");
                              _builder_4.append("$set: {");
                              _builder_4.newLine();
                              _builder_4.append("\t    \t\t\t\t");
                              String _name_12 = p_1.getName();
                              _builder_4.append(_name_12, "\t    \t\t\t\t");
                              _builder_4.append(":req.body.value");
                              _builder_4.newLineIfNotEmpty();
                              _builder_4.append("\t    \t\t\t");
                              _builder_4.append("}");
                              _builder_4.newLine();
                              _builder_4.append("\t    \t\t");
                              _builder_4.append("});");
                              _builder_4.newLine();
                              _builder_4.append("\t\t\t");
                              _builder_4.append("}");
                              _builder_4.newLine();
                              _builder_4.append("\t\t");
                              _builder_4.append("},");
                              _switchResult_1 = _builder_4;
                              break;
                          }
                        }
                        _builder.append(_switchResult_1);
                        _builder.newLineIfNotEmpty();
                        _builder.newLine();
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
    String _name_13 = controller.getName();
    _builder.append(_name_13);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateAppJs(final Iterable<Entity> entities, final Iterable<Controller> controllers) {
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
    _builder.newLine();
    _builder.append("// Mongoose Schemas");
    _builder.newLine();
    _builder.newLine();
    {
      for(final Entity e_1 : entities) {
        _builder.append("var ");
        String _firstLower_1 = StringExtensions.toFirstLower(e_1.getName());
        _builder.append(_firstLower_1);
        _builder.append("Schema = new mongoose.Schema({");
        _builder.newLineIfNotEmpty();
        {
          ParentEntity _parent = e_1.getParent();
          boolean _tripleNotEquals = (_parent != null);
          if (_tripleNotEquals) {
            {
              EList<Parameter> _parameters = e_1.getParent().getParameters();
              for(final Parameter p : _parameters) {
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
          }
        }
        {
          EList<Parameter> _parameters_1 = e_1.getParameters();
          for(final Parameter p_1 : _parameters_1) {
            _builder.append("\t");
            String _name_1 = p_1.getName();
            _builder.append(_name_1, "\t");
            _builder.append(": ");
            String _dataType_1 = p_1.getDataType();
            _builder.append(_dataType_1, "\t");
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
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("// Mongoose Models");
    _builder.newLine();
    _builder.newLine();
    {
      for(final Entity e_2 : entities) {
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
    _builder.newLine();
    _builder.append("//Endpoints");
    _builder.newLine();
    {
      for(final Controller c : controllers) {
        {
          EList<Entity> _base = c.getBase();
          for(final Entity e_3 : _base) {
            _builder.append("//");
            String _firstUpper_3 = StringExtensions.toFirstUpper(e_3.getName());
            _builder.append(_firstUpper_3);
            _builder.newLineIfNotEmpty();
            {
              ParentEntity _parent_1 = e_3.getParent();
              boolean _tripleNotEquals_1 = (_parent_1 != null);
              if (_tripleNotEquals_1) {
                {
                  EList<Parameter> _parameters_2 = e_3.getParent().getParameters();
                  for(final Parameter p_2 : _parameters_2) {
                    {
                      EList<String> _type = p_2.getType();
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
                              String _firstUpper_5 = StringExtensions.toFirstUpper(p_2.getName());
                              _builder_1.append(_firstUpper_5);
                              _builder_1.append("\', function (req, res)  {");
                              _builder_1.newLineIfNotEmpty();
                              _builder_1.append("\t");
                              String _firstUpper_6 = StringExtensions.toFirstUpper(e_3.getCtrlr().getName());
                              _builder_1.append(_firstUpper_6, "\t");
                              _builder_1.append(".get");
                              String _name_2 = p_2.getName();
                              _builder_1.append(_name_2, "\t");
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
                              String _firstUpper_9 = StringExtensions.toFirstUpper(p_2.getName());
                              _builder_2.append(_firstUpper_9);
                              _builder_2.append("\', function (req, res)  {");
                              _builder_2.newLineIfNotEmpty();
                              _builder_2.append("\t");
                              String _firstUpper_10 = StringExtensions.toFirstUpper(e_3.getCtrlr().getName());
                              _builder_2.append(_firstUpper_10, "\t");
                              _builder_2.append(".put");
                              String _name_3 = p_2.getName();
                              _builder_2.append(_name_3, "\t");
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
            _builder.append("\t\t");
            _builder.newLine();
            {
              EList<Parameter> _parameters_3 = e_3.getParameters();
              for(final Parameter p_3 : _parameters_3) {
                {
                  EList<Endpoint> _endpoint = c.getEndpoint();
                  for(final Endpoint end : _endpoint) {
                    {
                      String _name_4 = p_3.getName();
                      String _name_5 = end.getEndpoint().getName();
                      boolean _equals = Objects.equal(_name_4, _name_5);
                      if (_equals) {
                        {
                          EList<String> _type_1 = p_3.getType();
                          for(final String t_1 : _type_1) {
                            CharSequence _switchResult_1 = null;
                            String _string_1 = t_1.toString();
                            if (_string_1 != null) {
                              switch (_string_1) {
                                case "R":
                                  StringConcatenation _builder_3 = new StringConcatenation();
                                  _builder_3.append("app.get(\'/get");
                                  String _firstUpper_12 = StringExtensions.toFirstUpper(e_3.getName());
                                  _builder_3.append(_firstUpper_12);
                                  String _firstUpper_13 = StringExtensions.toFirstUpper(p_3.getName());
                                  _builder_3.append(_firstUpper_13);
                                  _builder_3.append("\', function (req, res)  {");
                                  _builder_3.newLineIfNotEmpty();
                                  _builder_3.append("\t");
                                  String _firstUpper_14 = StringExtensions.toFirstUpper(e_3.getCtrlr().getName());
                                  _builder_3.append(_firstUpper_14, "\t");
                                  _builder_3.append(".get");
                                  String _name_6 = p_3.getName();
                                  _builder_3.append(_name_6, "\t");
                                  _builder_3.append("(");
                                  String _firstUpper_15 = StringExtensions.toFirstUpper(e_3.getName());
                                  _builder_3.append(_firstUpper_15, "\t");
                                  _builder_3.append(", req, res);");
                                  _builder_3.newLineIfNotEmpty();
                                  _builder_3.append("});");
                                  _switchResult_1 = _builder_3;
                                  break;
                                case "U":
                                  StringConcatenation _builder_4 = new StringConcatenation();
                                  _builder_4.append("app.put(\'/put");
                                  String _firstUpper_16 = StringExtensions.toFirstUpper(e_3.getName());
                                  _builder_4.append(_firstUpper_16);
                                  String _firstUpper_17 = StringExtensions.toFirstUpper(p_3.getName());
                                  _builder_4.append(_firstUpper_17);
                                  _builder_4.append("\', function (req, res)  {");
                                  _builder_4.newLineIfNotEmpty();
                                  _builder_4.append("\t");
                                  String _firstUpper_18 = StringExtensions.toFirstUpper(e_3.getCtrlr().getName());
                                  _builder_4.append(_firstUpper_18, "\t");
                                  _builder_4.append(".put");
                                  String _name_7 = p_3.getName();
                                  _builder_4.append(_name_7, "\t");
                                  _builder_4.append("(");
                                  String _firstUpper_19 = StringExtensions.toFirstUpper(e_3.getName());
                                  _builder_4.append(_firstUpper_19, "\t");
                                  _builder_4.append(", req, res);");
                                  _builder_4.newLineIfNotEmpty();
                                  _builder_4.append("});");
                                  _switchResult_1 = _builder_4;
                                  break;
                              }
                            }
                            _builder.append(_switchResult_1);
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
