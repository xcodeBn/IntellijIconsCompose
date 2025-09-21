package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Setdefault: ImageVector
    get() {
        if (_Setdefault != null) return _Setdefault!!

        _Setdefault = ImageVector.Builder(
            name = "Setdefault",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(14f, 2f)
                lineTo(16f, 4f)
                lineTo(6f, 13f)
                lineTo(2f, 9f)
                lineTo(4f, 7f)
                lineTo(6f, 10f)
                close()
            }
        }.build()

        return _Setdefault!!
    }

private var _Setdefault: ImageVector? = null

