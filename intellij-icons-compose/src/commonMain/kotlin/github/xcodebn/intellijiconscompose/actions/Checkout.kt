package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Checkout: ImageVector
    get() {
        if (_Checkout != null) return _Checkout!!

        _Checkout = ImageVector.Builder(
            name = "Checkout",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF389FD6))
            ) {
                moveTo(3f, 6f)
                lineTo(10f, 13f)
                lineTo(3f, 13f)
                close()
            }
        }.build()

        return _Checkout!!
    }

private var _Checkout: ImageVector? = null

