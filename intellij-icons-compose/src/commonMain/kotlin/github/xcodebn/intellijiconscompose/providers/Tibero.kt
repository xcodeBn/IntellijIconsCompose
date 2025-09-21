package github.xcodebn.intellijiconscompose.providers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tibero: ImageVector
    get() {
        if (_Tibero != null) return _Tibero!!

        _Tibero = ImageVector.Builder(
            name = "Tibero",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF014A8E))
            ) {
                moveTo(15f, 2f)
                horizontalLineTo(1f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                lineTo(10f, 14f)
                verticalLineTo(4f)
                lineTo(15f, 4f)
                verticalLineTo(2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE61B1F))
            ) {
                moveTo(1f, 4f)
                horizontalLineTo(6f)
                verticalLineTo(2f)
                horizontalLineTo(1f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _Tibero!!
    }

private var _Tibero: ImageVector? = null

