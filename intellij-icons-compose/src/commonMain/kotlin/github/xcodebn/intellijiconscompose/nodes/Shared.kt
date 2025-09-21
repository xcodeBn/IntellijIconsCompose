package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Shared: ImageVector
    get() {
        if (_Shared != null) return _Shared!!

        _Shared = ImageVector.Builder(
            name = "Shared",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(9f, 16f)
                lineTo(16f, 16f)
                lineTo(16f, 9f)
                lineTo(9f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF231F20))
            ) {
                moveTo(14f, 10f)
                lineTo(14f, 10f)
                lineTo(10f, 10f)
                lineTo(10f, 11f)
                lineTo(13f, 11f)
                lineTo(10f, 14f)
                lineTo(11f, 15f)
                lineTo(14f, 12f)
                lineTo(14f, 15f)
                lineTo(15f, 15f)
                lineTo(15f, 11f)
                lineTo(15f, 10f)
                close()
            }
        }.build()

        return _Shared!!
    }

private var _Shared: ImageVector? = null

