package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Layoutpreviewonly: ImageVector
    get() {
        if (_Layoutpreviewonly != null) return _Layoutpreviewonly!!

        _Layoutpreviewonly = ImageVector.Builder(
            name = "Layoutpreviewonly",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 2f)
                lineTo(14f, 2f)
                lineTo(14f, 14f)
                lineTo(2f, 14f)
                lineTo(2f, 2f)
                close()
                moveTo(5f, 7f)
                lineTo(3f, 11f)
                lineTo(13f, 11f)
                lineTo(10f, 6f)
                lineTo(7f, 10f)
                lineTo(5f, 7f)
                close()
            }
        }.build()

        return _Layoutpreviewonly!!
    }

private var _Layoutpreviewonly: ImageVector? = null

