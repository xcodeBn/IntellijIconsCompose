package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Staticmark: ImageVector
    get() {
        if (_Staticmark != null) return _Staticmark!!

        _Staticmark = ImageVector.Builder(
            name = "Staticmark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 9f)
                lineTo(2f, 10f)
                lineTo(0f, 13f)
                lineTo(3f, 16f)
                lineTo(7f, 12f)
                lineTo(3f, 9f)
                close()
                moveTo(2f, 13f)
                lineTo(3f, 11f)
                lineTo(5f, 12f)
                lineTo(3f, 14f)
                lineTo(2f, 13f)
                close()
            }
        }.build()

        return _Staticmark!!
    }

private var _Staticmark: ImageVector? = null

