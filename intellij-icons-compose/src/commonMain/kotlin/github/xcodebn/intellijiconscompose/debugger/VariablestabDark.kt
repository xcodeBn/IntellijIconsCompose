package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VariablestabDark: ImageVector
    get() {
        if (_VariablestabDark != null) return _VariablestabDark!!

        _VariablestabDark = ImageVector.Builder(
            name = "VariablestabDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {

        }.build()

        return _VariablestabDark!!
    }

private var _VariablestabDark: ImageVector? = null

