package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Donemark: ImageVector
    get() {
        if (_Donemark != null) return _Donemark!!

        _Donemark = ImageVector.Builder(
            name = "Donemark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFFFFFF))
            ) {
                moveTo(2f, 2f)
                lineTo(3f, 4f)
                lineTo(5f, 2f)
                lineTo(6f, 2f)
                lineTo(3f, 5f)
                lineTo(1f, 3f)
                close()
            }
        }.build()

        return _Donemark!!
    }

private var _Donemark: ImageVector? = null

