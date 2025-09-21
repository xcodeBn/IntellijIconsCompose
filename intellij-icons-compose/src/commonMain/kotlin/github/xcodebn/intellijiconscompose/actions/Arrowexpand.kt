package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Arrowexpand: ImageVector
    get() {
        if (_Arrowexpand != null) return _Arrowexpand!!

        _Arrowexpand = ImageVector.Builder(
            name = "Arrowexpand",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF6E6E6E)),
                strokeLineWidth = 2.0f
            ) {
                moveTo(6f, 13f)
                lineTo(11f, 8f)
                lineTo(6f, 3f)
            }
        }.build()

        return _Arrowexpand!!
    }

private var _Arrowexpand: ImageVector? = null

