package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Groupbymodule: ImageVector
    get() {
        if (_Groupbymodule != null) return _Groupbymodule!!

        _Groupbymodule = ImageVector.Builder(
            name = "Groupbymodule",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {

        }.build()

        return _Groupbymodule!!
    }

private var _Groupbymodule: ImageVector? = null

