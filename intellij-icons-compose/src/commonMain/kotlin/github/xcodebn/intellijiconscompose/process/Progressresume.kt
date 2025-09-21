package github.xcodebn.intellijiconscompose.process

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Progressresume: ImageVector
    get() {
        if (_Progressresume != null) return _Progressresume!!

        _Progressresume = ImageVector.Builder(
            name = "Progressresume",
            defaultWidth = 14.0.dp,
            defaultHeight = 14.0.dp,
            viewportWidth = 14.0f,
            viewportHeight = 14.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 1f)
                lineTo(14f, 13f)
                lineTo(0f, 13f)
                close()
            }
        }.build()

        return _Progressresume!!
    }

private var _Progressresume: ImageVector? = null

