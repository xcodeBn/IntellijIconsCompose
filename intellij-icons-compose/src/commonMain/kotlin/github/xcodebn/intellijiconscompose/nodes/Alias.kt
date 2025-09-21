package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Alias: ImageVector
    get() {
        if (_Alias != null) return _Alias!!

        _Alias = ImageVector.Builder(
            name = "Alias",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF40B6E0))
            ) {
                moveTo(9f, 3f)
                lineTo(9f, 13f)
                lineTo(15f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF40B6E0))
            ) {
                moveTo(2f, 3f)
                lineTo(2f, 13f)
                lineTo(8f, 8f)
                close()
            }
        }.build()

        return _Alias!!
    }

private var _Alias: ImageVector? = null

