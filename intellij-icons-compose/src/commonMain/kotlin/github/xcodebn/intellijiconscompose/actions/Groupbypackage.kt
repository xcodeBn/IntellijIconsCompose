package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Groupbypackage: ImageVector
    get() {
        if (_Groupbypackage != null) return _Groupbypackage!!

        _Groupbypackage = ImageVector.Builder(
            name = "Groupbypackage",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(3f, 4f)
                lineTo(7f, 4f)
                lineTo(8f, 6f)
                lineTo(3f, 6f)
                close()
            }
        }.build()

        return _Groupbypackage!!
    }

private var _Groupbypackage: ImageVector? = null

